import java.util.ArrayList; // Buat bikin list peserta dan kelompok
import java.util.Collections; // Buat shuffle nama-nama biar random
import java.util.Scanner; // Scanner biar user bisa input langsung

public class SpinandSplit {

    public static void main(String[] args) {
        Scanner ssh = new Scanner(System.in); // Siapkan scanner buat input user

        System.out.println("=== Selamat Datang di Spin and Split ===");
        System.out.println("Program ini punya dua fitur utama yang asik banget!!:");
        System.out.println("1. Spin Nama: Pilih nama random dari daftar.");
        System.out.println("2. Pembagian Kelompok: Bagi peserta jadi beberapa tim secara random.");
        System.out.println("=======================================================");

        // Minta user pilih fitur: mau spin nama atau bagi kelompok
        System.out.println("Pilih opsi:\n1. Spin Nama Secara Acak\n2. Pembagian Kelompok Secara Acak");
        int choice = ssh.nextInt(); // Ambil pilihan user
        ssh.nextLine(); // Clear input biar nggak error (newline leftover)

        // Cek pilihan user, fitur apa yang mau dipakai
        if (choice == 1) {
            randomNamePicker(ssh); // Kalau pilih 1, jalankan fitur spin nama
        } else if (choice == 2) {
            randomGroupDivider(ssh); // Kalau pilih 2, jalankan fitur bagi kelompok
        } else {
            System.out.println("Pilihan tidak valid. Silakan mulai ulang program.");
        }

        // Jangan lupa tutup scanner, biar clean dan nggak bocor
        ssh.close();
    }

    // Fitur spin nama acak. Buat milih nama random dari list peserta
    private static void randomNamePicker(Scanner spin) {
        // Tanya jumlah peserta dulu, karena kita butuh nama mereka
        System.out.print("Masukkan jumlah peserta: ");
        int jumlahPeserta = spin.nextInt();
        spin.nextLine(); // Clear input biar aman

        // Kumpulin nama-nama peserta
        ArrayList<String> peserta = new ArrayList<>();
        for (int i = 0; i < jumlahPeserta; i++) {
            System.out.print("Masukkan nama peserta ke-" + (i + 1) + ": ");
            peserta.add(spin.nextLine()); // Tambahkan nama ke list
        }

        // Mulai spin nama sampai semua nama terpilih
        while (!peserta.isEmpty()) {
            Collections.shuffle(peserta); // Acak nama-nama di list
            String namaTerpilih = peserta.remove(0); // Pilih nama pertama dari list
            System.out.println("Nama yang terpilih secara acak: " + namaTerpilih);

            // Kalau masih ada nama, kasih tau siapa yang belum keluar
            if (!peserta.isEmpty()) {
                System.out.println("Nama tersisa: " + peserta);
            } else {
                // Semua nama udah keluar, done!
                System.out.println("Tidak ada nama yang tersisa. Semua nama telah dipilih!");
            }

            // Tanyain user, mau lanjut spin atau berhenti
            if (!peserta.isEmpty()) {
                System.out.print("Lanjutkan pengacakan? (ya/tidak): ");
                String jawaban = spin.nextLine();
                if (jawaban.equalsIgnoreCase("tidak")) {
                    System.out.println("Pengacakan dihentikan."); // Kalau jawab "tidak", stop
                    break;
                }
            }
        }
    }

    // Fitur buat bagi peserta jadi beberapa kelompok random
    private static void randomGroupDivider(Scanner split) {
        // Minta jumlah peserta dulu
        System.out.print("Masukkan jumlah peserta: ");
        int jumlahPeserta = split.nextInt();
        split.nextLine(); // Clear input biar nggak error

        // Kumpulin nama-nama peserta
        ArrayList<String> peserta = new ArrayList<>();
        for (int i = 0; i < jumlahPeserta; i++) {
            System.out.print("Masukkan nama peserta ke-" + (i + 1) + ": ");
            peserta.add(split.nextLine()); // Masukkan nama ke list
        }

        // Tanya berapa kelompok yang mau dibuat
        System.out.print("Masukkan jumlah kelompok yang diinginkan: ");
        int jumlahKelompok = split.nextInt();

        // Kalau jumlah kelompok nggak logis, suruh user masukkan ulang
        while (jumlahKelompok > jumlahPeserta || jumlahKelompok <= 0) {
            System.out.println("Jumlah kelompok nggak masuk akal. Harus lebih kecil atau sama dengan jumlah peserta dan lebih dari 0.");
            System.out.print("Masukkan jumlah kelompok yang diinginkan: ");
            jumlahKelompok = split.nextInt();
        }

        // Acak nama peserta biar random
        Collections.shuffle(peserta);

        // Buat list kosong untuk tiap kelompok
        ArrayList<ArrayList<String>> kelompok = new ArrayList<>();
        for (int i = 0; i < jumlahKelompok; i++) {
            kelompok.add(new ArrayList<>()); // List kosong buat tiap kelompok
        }

        // Masukkan peserta ke kelompok secara bergantian
        for (int i = 0; i < peserta.size(); i++) {
            int indexKelompok = i % jumlahKelompok; // Index kelompok, looping aja
            kelompok.get(indexKelompok).add(peserta.get(i)); // Tambahkan peserta ke kelompok
        }

        // Tampilkan hasil pembagian kelompok
        System.out.println("\n=== Hasil Pembagian Kelompok ===");
        for (int i = 0; i < jumlahKelompok; i++) {
            System.out.println("Kelompok " + (i + 1) + ": " + kelompok.get(i)); // Show timnya!
        }
    }
}
