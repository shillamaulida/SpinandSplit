public class method3 {
    public static void main(String[] args) {
        int hasil; 
        int bilangan = 5; 
        
        hasil = faktorial(bilangan); // Memanggil method faktorial() dan menyimpan di var hasil
        System.out.println("Nilai dari " + bilangan + "! adalah " + hasil); // Menampilkan hasil faktorial
    }

    // METHOD REKURSIF
    // Method yang memanggil dirinya sendiri hingga mencapai kondisi dasar untuk menyelesaikan tugas tertentu. 
    // Contohnya int faktorial(int bil) yang menghitung faktorial dengan pendekatan rekursif.

    // Contoh lain impleemntasi rekursi :
    // Fibonacci => 0, 1, 1, 2, 3, 5, 8, 13, dst.
    // Traversal Struktur Data Pohon 
    // Permutasi
    // dll.

    // Method rekursif untuk menghitung faktorial
    private static int faktorial(int bil) {
        if (bil == 1) // Kondisi dasar: jika bilangan adalah 1, kembalikan 1
            return 1;
        else
            return (bil * faktorial(bil - 1)); // Mengalikan bilangan saat ini dengan faktorial dari bilangan sebelumnya
    }
}

// NOTES
// misal menghitung 5!
// faktorial(5) = 5 * faktorial(4)
// faktorial(4) = 4 * faktorial(3)
// faktorial(3) = 3 * faktorial(2)
// faktorial(2) = 2 * faktorial(1)
// faktorial(1) = 1 (kondisi dasar)

// Kondisi Dasar :
// Kondisi yang menghentikan pemanggilan rekursif. 
// Tanpa kondisi dasar, method akan memanggil dirinya sendiri tanpa henti, 
// yang akan menyebabkan infinite recursion (rekursi tanpa akhir) 
// dan berakhir dengan stack overflow error.
    
