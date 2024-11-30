public class SwitchCase {
    public static void main(String[] args) {
         // SWITCH CASE
        // switch (condition) {
        //     case 1 :
        //     System.out.println("Condition 1");
        //         break;
        //     case 2 : 
        //     System.out.println("Condition 2");
        //         break;
        // }

        //SWITCH CASE BERTIPE DATA STRING
        String nama = "naufal";
        // int umur = 10;

        switch (nama) {
            case "Fitra" :
                System.out.println("Nama kamu Fitra");
                break;
            case "Darma" :
                System.out.println("Nama kamu Darma");
                break;
            case "Siti" :
                System.out.println("Nama kamu siti");
                break;
            case "naufal" :
                System.out.println("Nama kamu Naufal");
                break;
            case "Aca" :
                System.out.println("Nama kamu Aca");
                break;
            default : 
                System.out.println("Nama Aku Siapa?");
                break;
        }

        // SWITCH CASE BERTIPE DATA CHAR
        char grade = 'A';
        switch (grade) {
          case 'A':
              System.out.println("Excellent!");
              break;
          case 'B':
              System.out.println("Good");
              break;
          default:
                System.out.println("Invalid grade");
        }


        // // LENGTH, CHARAT, DAN SUBSTRING
        String nama2 = "Rion";
        String nama3 = "Fitra";
        String nama4 = "Nau fal'";

        // Length = jumlah huruf, hasil dalam bentuk int, 
        // namavariabel.length();

        int panjangNama2 = nama2.length();
        System.out.println(panjangNama2);

        System.out.println(nama3.length());

        System.out.println(nama4.length());

        // CharAt = untuk melihat huruf di index tertentu
        // Index = nomor yang menunjukkan urutan, istilah gampangnya kayak, huruf ke berapa
        // Di Java, index ini dimulai dari 0
    
        String nama5 = "SALSABILA";
        // S A L S A B I L A
        // 0 1 2 3 4 5 6 7 8

        System.out.println(nama5.length());
        char huruf = nama5.charAt(2);  // CharAt hasil dalam bentuk Char
        System.out.println(huruf);

        // SUBSTRING = mengambil beberapa huruf dalam suatu kata/kalimat
        // namavariabel.substring(mulai index ke berapa, berhenti di index ke berapa)
        // jika hanya memiliki 1 index di dalam substring, maka dia akan mengambil mulai dari index tersebut hingga index terakhir

        
        String nama6 = "SALSABILA CACA";

        // S A L S A B I L A   C  A  C  A
        // 0 1 2 3 4 5 6 7 8 9 10 11 12 13

        //System.out.println(nama6.substring(0, 7));
        System.out.println(nama6.substring(9, 14));

        System.out.println(nama6.substring(3, 7));

        // ParseInt : mengubah string menjadi integer (hanya bentuk angka)
        String angka = "FILKOM 123";
        int angkaInt = Integer.parseInt(angka.substring(7,10));
        System.out.println(angkaInt);
        int jumlahin = angkaInt + 5;
        System.out.println(jumlahin);
        
        }
}