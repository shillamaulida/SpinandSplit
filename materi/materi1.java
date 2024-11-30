// import java.util.Scanner;

public class materi1 {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);         // Materi Output, Input, Operasi Aritmatika (+-/*, %, ++, +-dst.), Math.sqrt, printf

        // Comment Line : "Ctrl + /"

        // Output -------------------------------------------------------------------------------------
        // System.out.println("Halo! Nama saya Adi"); //untuk kalimat menggunakan tanda petik ("")
        // System.out.println(16.7); //untuk angka tidak perlu tanda petik

        //contoh menggunakan variabel
        // String nama1 = "Liya";
        // int angka1 = 2;
        // int angka2 = 3;
        // double angka3 = 3.5;
        // System.out.println("Hai! namaku " + nama1 + " umurku " + (angka1+angka2) + " tahun");

        //Input -------------------------------------------------------------------------------------
        //Sebelum melakukan input, ketik import java.util.Scanner; pada bagian awal sebelum class 
        
        // Scanner input = new Scanner (System.in); 
        //untuk 'input' bisa diganti jadi apa saja
        //misalnya diubah menjadi 'masuk', nanti menjadi masuk.nextLine();

        //Buat input string, ada 2 jenis, yaitu next dan nextLine
        // String nama2 = input.nextLine(); //Bisa lebih dari 1 kata, 1 kalimat
        // String nama3 = input.next(); //hanya bisa 1 kata

        // System.out.println(nama2); 
        // System.out.println(nama3); //kalo tetep maksa input lebih dari 1 kata, yang kebaca tetep 1

        // //Input Lain ---------------------------------------------------------------------------------
        // int angka4 = input.nextInt();
        // float angka5 = input.nextFloat();
        // double angka6 = input.nextDouble();
        // boolean kebenaran1 = input.nextBoolean();
        // System.out.println(angka4);
        // System.out.println(angka5);
        // System.out.println(angka6);
        // System.out.println(kebenaran1);
        // // Referensi bacaan : https://www.geeksforgeeks.org/scanner-class-in-java/

        // //Contoh input Char ---------------------------------------------------------------------------------
        // char karakter = scanner.next().charAt(0);
        // System.out.println(karakter);

        //Contoh input ---------------------------------------------------------------------------------
        // penggunaan input.nextLine();

        // String nnn = input.next();
        // System.out.println(nnn);
        // int bbb = input.nextInt();
        // System.out.println(bbb);

        // input.nextLine(); //untuk membaca karakter '\n' yang tersisa setelah nextInt()

        // String ddd = input.nextLine();
        // System.out.println(ddd);
        // int eee = input.nextInt();
        // System.out.println(eee);
        // System.out.println(nnn + bbb + ddd + eee);
        // System.out.println(ddd);


        //Operasi Aritmatika------------------------------------------------------------------------

        // + Untuk pertambahan
        // - Untuk pengurangan
        // / Untuk pembagian
        // * Untuk perkaliann
        // % untuk modulus

        // Contoh 1 --------------------------------------------------------------------------------

        // int a = 5;
        // double b = 4.5;
        // int c = 24;
        // double z = a+b;
        // double y = c/ (double) a; 
        // double x = c/5.0;
        // System.out.println(x);

        // //Contoh 2 ---------------------------------------------------------------------------------
        // int aa = 3;
        // int bb = 6;
        // double cc = 4;
        // double dd = 7;
        // double ee = 5 * 2 + bb / 4 - dd; 
        // System.out.println(ee);
        // double ff = bb + dd / 2 ;
        // System.out.println(ff);

        // // % modulo = sisa pembagian ---------------------------------------------------------------
        // int aaa = 9 % 5;
        // System.out.println(aaa); //outputnya 4
        // int ccc = 5 * 9 % 7;
        // System.out.println(ccc); //outputnya 5

        // //Perpangkatan -----------------------------------------------------------------------------
        // double desimal1 = Math.pow(2, 3); //a pangkat b
        // System.out.println(desimal1);

        // // //Akar 2 --------------------------------------------------------------------------------
        // double desimal2 = Math.sqrt(16);
        // System.out.println(desimal2);

        // // //Akar 3 --------------------------------------------------------------------------------
        // double desimal3 = Math.cbrt(27);
        // System.out.println(desimal3);

        // //Referensi bacaan : https://www.javatpoint.com/java-math

        // //printf ----------------------------------------------------------------------------------
        // //bisa batesin angka di belakang koma buat desimal
        // String nama = "Icha";
        // int nilai = 90;
        // float rataRata = 98.7825f; // jangan lupa beri f fibelakang tipe data float
        // System.out.printf("Nama saya adalah %s\n", nama);
        // System.out.printf("Nilai saya adalah %d\n", nilai);
        // System.out.printf("Rata-rata saya adalaah %.2f\n", rataRata);
        // System.out.printf("Nama saya adalah %s, nilai saya %d, dan rata rata saya %.2f\n", nama, 90, rataRata);
        //catatan tambahan
        //gunakan \n : untuk membuat baris baru
        //ketika menggunakan printf variabel bertipe data string diubah menjadi %s dan int menjadi %d
        //jika desimal gunakan %.2f yang artinya mengambil 2 angka dibelakang koma (angka 2 bisa diganti jadi berapapun)
        //ketika menggunakan %.2f itu otomatis dibulatkan misal 90.445 akan menjadi 90.45 namun jika 90.444 akan tetap jadi 90.44
    }

}
    
