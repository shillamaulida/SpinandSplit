public class method2 {
    public static void main(String[] args) {
        int[] arr = {2, 7, 5, 19, 4, 11, 3, 27, 17, 10}; // Inisialisasi array dengan angka acak
        arr = sort(arr); // Memanggil method sort() : 
                         // mengurutkan array dan menyimpan hasilnya di variabel arr
        
        // Looping : menampilkan setiap elemen array setelah diurutkan
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index ke " + (i + 1) + " : " + arr[i]); // Menampilkan nilai array pada setiap indeks
        }
    }

    // METHOD RETURN VALUE BERPARAMETER ARRAY
    // Mengembalikan nilai tertentu setelah menjalankan operasi. 
    // Contohnya int[] sort(int[] acak) :
    // mengurutkan array dan mengembalikan array yang sudah diurutkan.

    // Method sort : mengurutkan array bernama 'acak' menggunakan algoritma bubble sort
    private static int[] sort(int[] acak) {
    // private : method sort hanya dapat diakses di dalam class method2 (dimana method ini dideklarasikan). Method ini tidak bisa diakses di luar class tsb.
    // int[] : method sort akan me-return nilai berupa array integer
    // sort : nama method
    // int[] acak : parameter method => menerima array integer (int[]) sebagai input.

        int bil1 = 0; // Inisialisasi bil1 untuk looping luar
        int bil2 = 0; // Inisialisasi bil2 untuk looping dalam
        
        // Looping luar : mengurutkan elemen dalam array
        while (bil1 < acak.length) {
            bil2 = bil1; // mengontrol indeks bil1 untuk dibandingkan dengan elemen berikutnya
            
            // Looping dalam : membandingkan elemen dan menukar posisi (jika diperlukan)
            while (bil2 < acak.length) {
                if (acak[bil1] < acak[bil2]) { // Jika elemen bil1 < dari elemen bil2
                    int temp = acak[bil1]; // temp : variabel sementara untuk menukar nilai
                    acak[bil1] = acak[bil2]; // Menukar posisi elemen
                    acak[bil2] = temp; // Menyimpan nilai sementara ke posisi yang ditukar
                }
                bil2++; // bil2 bertambah untuk melanjutkan perbandingan elemen berikutnya
            }
            bil1++; // bil1 bertambah setelah loop dalam selesai,
                    // untuk melanjutkan perbandingan elemen berikutnya
        }
        return acak; // Mengembalikan array yang sudah diurutkan
    }
}
    
