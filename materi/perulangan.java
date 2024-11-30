// import java.util.Scanner;

public class perulangan {
    public static void main(String[] args) {
        // Scanner input = new Scanner (System.in);
        // MATERI PERULANGAN
        
        // INCREMENT 
        // increment mudahnya berarti +1
        // int a = 0;
        // a++;
        // System.out.println(a);

        // DECREMENT 
        // decrement mudahnya berarti -1
        // int b = 10;
        // b--;
        // System.out.println(b);
        

        // FOR Loop
        // Digunakan jika kita sudah mengetahui jumlah perulangan
       
        // for(inisialisasi; kondisi; step nilai){
        //     aksi;
        // }

        // for(int nilai = 0; nilai < 10 ; nilai++){
        //     System.out.println("for loop ke-" + nilai);
        // }

        // String nama = "Safira";
        // for (int i = 0; i<nama.length(); i++) {
        //     System.out.println(nama.charAt(i));
        // }


        // WHILE Loop
        // Digunakan jika tidak tahu berapa kali perulangan

        //    while (kondisi) {
        //        aksi
        //    }

        // int a = 0;
        // boolean kondisi = true;
        
        // while (kondisi) {
        //     System.out.println("while loop ke-" + a);
        //     if (a == 10){
        //         kondisi = false;
        //     }
        //     a++;
        // }
        //     System.out.println("selesai");

        // int i = 0;
        // while (i<10) {
        //     System.out.println("i bernilai " + i);
        //     System.out.println("Ini perulangan ke-" + (i+1));
        //     System.out.println("-------------------------------\n");
        //     i++;
        // }

        // System.out.println("mulai");
        // boolean masukLoop = true;
        // while (masukLoop) {
        //     System.out.println("Pilih perintah: ");
        //     System.out.println("MAKAN, MINUM, TIDUR, EXIT");
        //     String pilihan = input.nextLine();
        //     switch (pilihan) {
        //         case "MAKAN" :
        //         System.out.println("Kamu harus makan!\n");
        //         break;
        //         case "MINUM" :
        //         System.out.println("Kamu harus minum!\n");
        //         break;
        //         case "TIDUR" :
        //         System.out.println("Kamu harus tidur!\n");
        //         break;
        //         case "EXIT" :
        //         System.out.println("Penulisan perintah selesai");
        //         masukLoop = false;
        //         break;
        //     }
        // }

        
        // BREAK AND CONTINUE

        // int a = 0;
        // while(true){
        //     if(a == 10){
        //         break; // ini adalah keyword untuk memaksa keluar dari loop
        //     } else if(a == 5){
        //         continue; // ini adalah keyword untuk memaksa memulai aksi dari awal
        //     } 
        //     a++;
        //     System.out.println("looping ke - " + a);
        // }

        // for (int g = 0; g < 10; g++) {
        //     if (g == 8) {
        //         break;
        //     } else if (g % 2 == 0) {
        //         System.out.println("g bernilai: " + g);
        //     } else {
        //         System.out.println("g bernilai: " + g);
        //         continue;
        //     }
        // }


        // DO-WHILE
        // sebenernya sama aja sama while, cuma beda di peletakannya aja
        
        //    do {
        //        aksi
        //    } while (kondisi);

        // int a = 0;
        // boolean kondisi = true;
        // do {
        //     a++;
        //     System.out.println("do while ke-" + a);
        //     if (a == 2) {
        //         kondisi = false;
        //     }
        // } while(kondisi);

        // int a = 5;
        // do {
        //     System.out.println("a = " + a);
        //     a++;
        // } while (a < 8);


        // NESTED LOOP
        // for (int t = 0; t<5; t++) {
        //     System.out.println("FOR1, t = " + t);
        //     System.out.println("--------------");
        //     for (int j = 0; j<5; j++) {
        //         System.out.println("FOR2, j = " + j);
        //     }
        //     System.out.println("==============");
        // }

        // for (int n = 0; n<5; n++) {
        //     for (int m = 0; m<5; m++) {
        //         System.out.print("* ");
        //         if (n == m) {
        //             break;
        //         }
        //     }
        //     System.out.println("");
        // }

    }
}
