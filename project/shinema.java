//Program ini adalah sistem pemesanan untuk tiket bioskop studio VVIP (First Class Ticket) bioskop Shinema
//dengan 5 kursi tersedia. Pengguna dapat memilih film, kursi, dan melakukan pembayaran dengan validasi otomatis. 
//Program juga mencetak struk pembayaran dan memberikan opsi untuk memesan tiket lagi atau keluar.

import java.util.Scanner;
public class shinema {
    // jadwal film yang tersedia, serta variabel untuk menyimpan tiket dan kursi yang dipilih 
    static String[] daftarFilm = {"Petak Umpet - 12:00", "Wicked - 15:00", "Moana 2 - 18:00"};
    static String tiketKu = null; // variabel untuk menyimpan film yang sudah dipilih
    static String kursiKu = null; // variabel untuk menyimpan kursi yang sudah dipilih

    public static void main(String[] args) {
        Scanner shine = new Scanner(System.in); // scanner untuk input user

        // program dibuat dengan loop, memungkinkan pengguna untuk terus melakukan aksi sampai memilih keluar
        while (true) {
            System.out.println("\n=== Sistem Pembelian Tiket ===");
            System.out.println("1. Pesan Tiket"); // menu untuk memesan tiket film
            System.out.println("2. Lihat Jadwal Film"); // menu untuk melihat jadwal film yang tersedia
            System.out.println("3. Cabut (Keluar)"); // menu untuk keluar dari program
            System.out.print("Mau pilih menu mana? (1-3): ");
            int pilihan = shine.nextInt(); // membaca pilihan user

            switch (pilihan) {
                case 1:
                    // jika pengguna memilih untuk pesan tiket
                    pesanTiket(shine); // memanggil fungsi untuk pesan tiket
                    bayarTiket(shine); // setelah pesan tiket, lanjut ke pembayaran
                    if (!mauBeliLagi(shine)) { // tanya ke user apakah mau beli lagi
                        System.out.println("\nMakasih udah mampir! Sampai jumpa lagi~");
                        shine.close(); // menutup scanner sebelum keluar
                        return; // keluar dari program
                    }
                    break;
                case 2:
                    // jika pengguna memilih untuk melihat jadwal film
                    lihatJadwal();
                    break;
                case 3:
                    // jika pengguna memilih untuk keluar
                    System.out.println("\nMakasih udah mampir! Sampai jumpa lagi~");
                    shine.close(); // menutup scanner sebelum keluar
                    return; // keluar dari program
                default:
                    // jika pengguna memasukkan pilihan yang tidak valid
                    System.out.println("Pilihan ngga valid, coba lagi ya!");
            }
        }
    }
    public static void pesanTiket(Scanner input) {
        // fungsi ini digunakan untuk memilih film berdasarkan jadwal yang tersedia
        System.out.println("\n= Pilih Jadwal Film =");
        for (int i = 0; i < daftarFilm.length; i++) {
            System.out.println((i + 1) + ". " + daftarFilm[i]); // menampilkan daftar film beserta nomor pilihannya
        }
        System.out.print("Mau nonton yang mana? Pilih (1-" + daftarFilm.length + "): ");
        int pilihanJadwal = input.nextInt(); // membaca input user untuk jadwal film

        if (pilihanJadwal >= 1 && pilihanJadwal <= daftarFilm.length) {
            // jika input valid, simpan pilihan ke variabel tiketKu
            tiketKu = daftarFilm[pilihanJadwal - 1];
            System.out.println("Tiket berhasil dipesan! Kamu bakal nonton: " + tiketKu);
            pilihKursi(input); // setelah memilih film, lanjut memilih kursi
        } else {
            // jika input tidak valid, ulangi proses pemesanan tiket
            System.out.println("Pilihan ngga valid. Coba lagi deh!");
            pesanTiket(input);
        }
    }

    public static void pilihKursi(Scanner input) {
        // fungsi ini digunakan untuk memilih kursi yang tersedia
        String[] deretanKursi = {"A1", "A2", "A3", "A4", "A5"}; // daftar kursi
        boolean[] kursiUdahDiambil = {false, false, false, false, false}; // status ketersediaan kursi (true jika sudah dipesan)

        System.out.println("\n=== Pilih Kursi ===");
        for (int i = 0; i < deretanKursi.length; i++) {
            // menampilkan kursi yang tersedia beserta statusnya (apakah sudah diambil atau belum)
            System.out.println((i + 1) + ". " + deretanKursi[i] + (kursiUdahDiambil[i] ? " (Udah Diambil)" : ""));
        }

        System.out.print("Pilih kursi (1-" + deretanKursi.length + "): ");
        int pilihanKursi = input.nextInt(); // membaca input user untuk kursi yang dipilih

        if (pilihanKursi >= 1 && pilihanKursi <= deretanKursi.length && !kursiUdahDiambil[pilihanKursi - 1]) {
            // jika kursi valid dan belum diambil, simpan ke variabel kursiKu
            kursiKu = deretanKursi[pilihanKursi - 1];
            kursiUdahDiambil[pilihanKursi - 1] = true; // tandai kursi sebagai sudah diambil
            System.out.println("Kursi " + kursiKu + " berhasil dipilih!");
        } else {
            // jika kursi tidak valid atau sudah diambil, ulangi proses pemilihan kursi
            System.out.println("Kursi nggak valid atau udah diambil. Coba pilih lagi!");
            pilihKursi(input);
        }
    }

    public static void lihatJadwal() {
        // fungsi ini digunakan untuk melihat jadwal film yang tersedia
        System.out.println("\n=== Jadwal Film ===");
        for (String film : daftarFilm) {
            System.out.println("- " + film); // menampilkan setiap jadwal film
        }
    }

    public static void bayarTiket(Scanner input) {
        // fungsi ini digunakan untuk proses pembayaran tiket
        System.out.println("\n=== Bayar Tiket ===");
        System.out.println("Tiket: " + tiketKu); // menampilkan film yang sudah dipilih
        System.out.println("Kursi: " + kursiKu); // menampilkan kursi yang sudah dipilih
        System.out.println("Harga: Rp 100.000"); // harga tetap
        System.out.print("Masukkan uang kamu (Rp): ");
        int uang = input.nextInt(); // membaca input jumlah uang dari user

        if (uang >= 100000) {
            // jika uang cukup atau lebih, hitung kembalian
            int kembalian = uang - 100000;
            cetakStruk(kembalian); // Cetak struk pembayaran
        } else {
            // jika uang kurang, ulangi proses pembayaran
            System.out.println("Uangnya kurang. Coba lagi ya!");
            bayarTiket(input);
        }
    }

    public static void cetakStruk(int kembalian) {
        // fungsi untuk mencetak struk pembayaran
        System.out.println("\n=== Struk Pembayaran ===");
        System.out.println("Tiket: " + tiketKu); 
        System.out.println("Kursi: " + kursiKu);
        System.out.println("Harga: Rp 100.000"); 
        System.out.println("Kembalian: Rp " + kembalian); // Tampilkan kembalian jika ada
        System.out.println("Status: LUNAS");
        System.out.println("=========================");
        System.out.println("Pembayaran selesai! Selamat menonton ya~");
    }

    public static boolean mauBeliLagi(Scanner input) {
        // fungsi untuk menanyakan ke pengguna apakah ingin membeli tiket lagi
        System.out.print("\nMau beli tiket lagi? (y/n): ");
        char jawaban = input.next().toLowerCase().charAt(0); // membaca input jawaban ('y' atau 'n')
        return jawaban == 'y'; // kembali ke menu utama jika jawaban 'y'
    }
}
