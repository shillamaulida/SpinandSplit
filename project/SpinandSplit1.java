import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SpinandSplit1 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        
        System.out.println("Selamat datang di SpinAndSplit!");
        System.out.println("Pilih opsi:");
        System.out.println("1. Spin nama secara acak");
        System.out.println("2. Pembagian kelompok secara random");
        System.out.print("Masukkan pilihan (1 atau 2): ");
        int pilihan = user.nextInt();
        user.nextLine();
        
        if (pilihan == 1) {
            ArrayList<String> daftarNama = new ArrayList<>();
            System.out.print("Masukkan jumlah peserta: ");
            int totalPeserta = user.nextInt();
            user.nextLine();

            for (int i = 0; i < totalPeserta; i++) {
                System.out.print("Masukkan nama peserta ke-" + (i + 1) + ": ");
                daftarNama.add(user.nextLine());
            }

            Collections.shuffle(daftarNama);
            System.out.println("Nama yang dipilih secara acak: " + daftarNama.get(0));

        } else if (pilihan == 2) {
            ArrayList<String> daftarPeserta = new ArrayList<>();
            System.out.print("Masukkan jumlah peserta: ");
            int jumlahPeserta = user.nextInt();
            user.nextLine();

            for (int i = 0; i < jumlahPeserta; i++) {
                System.out.print("Masukkan nama peserta ke-" + (i + 1) + ": ");
                daftarPeserta.add(user.nextLine());
            }

            System.out.print("Masukkan jumlah kelompok yang diinginkan: ");
            int totalKelompok = user.nextInt();

            while (totalKelompok > jumlahPeserta || totalKelompok <= 0) {
                System.out.println("Jumlah kelompok tidak valid. Harus lebih kecil atau sama dengan jumlah peserta dan lebih dari 0.");
                System.out.print("Masukkan jumlah kelompok yang diinginkan: ");
                totalKelompok = user.nextInt();
            }

            Collections.shuffle(daftarPeserta);

            // Inisialisasi array list untuk setiap kelompok
            ArrayList<ArrayList<String>> kelompokRandom = new ArrayList<>();
            for (int i = 0; i < totalKelompok; i++) {
                kelompokRandom.add(new ArrayList<String>());
            }

            // Membagi peserta ke dalam kelompok
            for (int i = 0; i < daftarPeserta.size(); i++) {
                int indeksKelompok = i % totalKelompok;
                kelompokRandom.get(indeksKelompok).add(daftarPeserta.get(i));
            }

            // Menampilkan hasil pembagian kelompok
            System.out.println("\n=== Hasil Pembagian Kelompok ===");
            for (int i = 0; i < totalKelompok; i++) {
                System.out.println("Kelompok " + (i + 1) + ": " + kelompokRandom.get(i));
            }
        } else {
            System.out.println("Pilihan tidak valid. Silakan pilih 1 atau 2.");
        }

        user.close();
    }
}

