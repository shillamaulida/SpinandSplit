// METHOD : 
// blok kode dalam program yang 
// dapat dipanggil untuk menjalankan tugas tertentu. 
// Methods membantu dalam mengatur dan memisahkan 
// fungsi program, 
// membuat kode lebih terstruktur dan dapat digunakan kembali.


// import java.util.*;

// Class utama bernama method1
public class method1 {
    // METHOD VOID
    // Tidak mengembalikan nilai apa pun dan hanya menjalankan tugas tertentu, 
    // seperti System.out.println()

    // PARAMETER : ibarat "tempat penampung"
    // Nilai yang dikirimkan ke method;
    // Dapat berupa nilai apapun (integer, string, array, dll)

    // Method Void tanpa parameter yang menampilkan teks
    static void tampilkanNama() {
        System.out.println("Nama saya Hilal dari kelas TI D");
    }

    // Method Void dengan satu parameter untuk menampilkan nama
    static void tampilkanNama(String nama) {
        System.out.println("Nama saya " + nama + " dari kelas TI D");
    }

    // Method Void dengan dua parameter untuk menampilkan nama dan kelas
    static void tampikanNama(String nama, String kelas) {
        System.out.println("Nama saya " + nama + " dari kelas " + kelas);
    }

    // Method Void dengan dua parameter untuk menampilkan nama dan umur
    static void tampilkanUmur(String nama, int umur) {
        System.out.println("Nama saya " + nama + " umur " + umur);
    }

    // Method Void dengan tiga parameter untuk menampilkan nama dan umur
    static void tampilkanLengkap(String nama, int umur,  String kelas) {
        System.out.println("Nama saya " + nama + " umur " + umur + " dari Kelas " + kelas);
    }
    
    // Method Void untuk menghitung dan menampilkan total umur dari dua angka
    static void totalUmur(int umurSatu, int umurDua) {
        int totalUmur = umurSatu + umurDua; // Menghitung total umur
        System.out.println("Umur satu = " + umurSatu);
        System.out.println("Umur Dua = " + umurDua);
        System.out.println("Total umurnya adalah " + totalUmur);
    }


    // METHOD RETURN VALUE
    // Mengembalikan suatu nilai (misalnya int, boolean, dll.) 
    // setelah menyelesaikan tugasnya. 
    // berguna saat hasil perhitungan atau nilai tertentu 
    // ingin disimpan 
    // atau digunakan lebih lanjut dalam program.

    // Method Return Value yang mengembalikan angka 7
    static int getAngka7() {
        return 7;
    }

    // Method Return Value untuk menjumlahkan dua angka dan mengembalikan hasilnya
    static int tambahDuaAngka(int a, int b) {
        int hasil = a + b;
        return hasil;
    }

    // Method Return Value yang memeriksa apakah sebuah angka ganjil atau genap
    static boolean isGanjil(int a) {
        if (a % 2 == 0) { // Memeriksa jika angka genap
            System.out.println("Ini adalah genap!");
            return false; // Mengembalikan false jika angka genap
        } else {
            return true; // Mengembalikan "true" jika angka ganjil
        }
    }

    // Method Return Value untuk menghitung jumlah elemen dalam array
    static int hitungJumlah(int[] array) {
        int hasil = 0;
        for(int i = 0; i < array.length; i++) { // Looping melalui setiap elemen array
            hasil = hasil + array[i]; // Menambahkan setiap elemen ke hasil
        }
        return hasil; // Mengembalikan hasil penjumlahan
    }
    
    // MAIN METHOD : untuk eksekusi program Java. 
    // Setiap program Java yang dapat dieksekusi harus memiliki metode main.
    public static void main(String[] args) {
        // Memanggil Method Void
        // tampilkanNama(); // output : Nama saya Hilal dari kelas TI D
        // tampilkanNama("hanifa"); 
        // tampikanNama("Salma", "TI A"); 
        // tampilkanLengkap("Ibra", 20, "TIF E" ); // Mengomentari baris karena method tampilkanNama() dengan tiga parameter tidak ada
        // tampilkanUmur("Keihan", 15); 
        // totalUmur(15, 50);

        // Memanggil Method Return Value

        // contoh 1 :
        // getAngka7(); // (hasilnya tidak ditampilkan) 
                     // Ketika memanggil getAngka7(), method mengembalikan nilai 7, 
                     // tetapi nilai tsb tidak disimpan dalam variabel atau dicetak

        // agar dapat tercetak : 
        // System.out.println(getAngka7()); 
        
        // int angka7 = getAngka7(); // Menyimpan nilai 7 dalam variabel
        // System.out.println(angka7); // cetak nilai variabel 

        // contoh 2 : 
        // tambahDuaAngka(5, 6); // (hasilnya tidak ditampilkan)

        // System.out.println(tambahDuaAngka(5, 6)); 

        // int a = tambahDuaAngka(getAngka7(), 10); 
        // System.out.println(a); 

        // check apakah angka isGanjil?
        // System.out.println(isGanjil(0)); // Menampilkan hasil (angka ganjil / genap)

        // Deklarasi dan inisialisasi array integer
        int[] array1 = new int [] {1,2,3,4,5}; 
        int[] array2 = new int [] {7,8,9,5}; 
        int[] array3 = new int [] {7,11,5};

        System.out.println(hitungJumlah(array1)); 
        System.out.println(hitungJumlah(array2)); 
        System.out.println(hitungJumlah(array3));

        // Hitung jumlah elemen array1 tanpa method hitungJumlah()
        // int hasil1 = 0;
        // for(int i = 0; i < array1.length; i++) { // Looping melalui setiap elemen array1
        //     hasil1 = hasil1 + array1[i]; // Menambahkan setiap elemen ke hasil1
        // }
        // System.out.println(hasil1); 

        // Hitung jumlah elemen array2 tanpa method hitungJumlah()
        // int hasil2 = 0;
        // for(int i = 0; i < array2.length; i++) {
        //     hasil2 = hasil2 + array2[i];
        // }
        // System.out.println(hasil2);

        // Hitung jumlah elemen array3 tanpa method hitungJumlah()
        // int hasil3 = 0;
        // for(int i = 0; i < array3.length; i++) {
        //     hasil3 = hasil3 + array3[i];
        // }
        // System.out.println(hasil3);
    } 
}
