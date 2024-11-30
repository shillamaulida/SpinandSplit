import java.util.Scanner;

public class SeleksiKondisi {
    public static void main(String[] args) {
       
        // SELEKSI KONDISI
        // Ada 3 jenis seleksi kondisi 
        // 1. Conditional Assignment
        // 2. IF-ELSE ELSE-IF
        // 3. SWITCH-CASE

        //----------------------------------------------------------------------------------------------
        // == -> sama dengan
        // != -> tidak sama dengan
        // >  -> lebih dari
        // >= -> lebih dari sama dengan
        // <  -> kurang dari
        // <= -> kurang dari sama dengan 

        //Conditional Assignment--------------------------------------------------------------------------------------
        String s = "filkom";
        String val = (s=="filkom")?"Brawijaya" : "null"; 
        System.out.println(s+" "+val);
        

        // IF-ELSE --------------------------------------------------------------------------------------
        int a = 7;
        int b = 5;
        if (a == b) {
            System.out.println("a sama dengan b");
        } else {
            System.out.println("a tidak sama dengan b");
        }

        //--------------------------------------------------------------------------------------
        int c = 6;
        int d = 3;
        if (c > d) {
            System.out.println("");
        } else {
            System.out.println("d lebih besar daripada c");
        }

        // IF -ELSE ------------------------------------------------------------------------------------
        int jam = 14;
        if (jam < 12) {
            System.out.println("Pagi");
        } else if (jam < 16) {
            System.out.println("Siang");
        } else if (jam < 18) {
            System.out.println("Sore");
        } else {
            System.out.println("Malam");
        }

        //------------------------------------------------------------------------------

        int umur = 10; 
        if (umur < 2) {
            System.out.println("Balita");
        } else if (umur < 10) {
            System.out.println("Anak kecil");
        } else if (umur < 18) {
            System.out.println("Remaja");
        } else if (umur < 60) {
            System.out.println("Dewasa");
        } else {
            System.out.println("Lansia");
        }

        //------------------------------------------------------------------------------
        Scanner input = new Scanner(System.in);
        String nama = input.nextLine();
        if(nama == "Diha") {
            System.out.println("Nama sama");
        } else {
            System.out.println("Nama beda!");
        }

        String nama2 = "Dina";
        if (nama2.equals("Dina")) {
            System.out.println("Nama sama");
        } else {
            System.out.println("Nama beda");
        }

        String nama3 = "Ayu";
        if (nama3.equalsIgnoreCase("AYU")) {
            System.out.println("Nama sama");
        } else {
            System.out.println("Nama beda");
        }

        // OPERATOR AND & OR ------------------------------------------------------------------------------
        // AND (dan) -> pakai &&
        // OR (atau) -> pakai ||

        String namaDepan = "New";
        String namaBelakang = "Jeans";

        if (namaDepan.equals("New") && namaBelakang.equals("Jeans")) {
            System.out.println("Ini NewJeans");
        } else {
            System.out.println("Nama salah");
        }

        int angka1 = 10;
        int angka2 = 19;

        if (angka1 == 5 || angka2 <30) {
            System.out.println("IF dijalankan");
        } else {
            System.out.println("ELSE dijalankan");
        }

        // Conditional Assignment ------------------------------------------------------------------------------
        int aa = 10;
        int bb = 20;
        String x = (aa<bb) ? "a kurang dari b" : "b kurang dari a";
        System.out.println(x);
        //lat
        String nama4 = "Andi";
        System.out.println((nama4.equals("Jamal")) ? "X" : "Y");

        System.out.println(((bb/2) == 10) ? "Nol" : "Satu");

        // NESTED IF -------------------------------------------------------------------------------------------
        int umur1 = 20;
        if (umur1 < 17) {
            System.out.println("Kamu masih di bawah umur");
        } else {
            if (umur1 < 22) {
                System.out.println("Kamu lagi kuliah");
            } else {
                System.out.println("Kamu sudah lulus aamiin");
            }
        }
        input.close();
    }
}
    
