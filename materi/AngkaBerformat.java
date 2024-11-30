import java.util.Scanner;

public class AngkaBerformat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String angka = input.nextLine();
        
        String[] angkaPisah = angka.split("[ /]a");

        double desimal = 0;
        
        int pembilang = 0;
        int penyebut = 0;
        
        int angkaAwal = 0;
        
        int angkaUtuh = 0;
        int sisaPec = 0;
        
        if (angkaPisah.length == 1) {
            desimal = Double.parseDouble(angkaPisah[0]);
            int a = 1;
            while (a <= 10) {
                if (desimal*a == (int) (desimal*a)) {
                    pembilang = (int) (desimal*a);
                    penyebut = a;
                    break;
                }
                a++;
            }
        } else if (angkaPisah.length == 2) {
            pembilang = Integer.parseInt(angkaPisah[0]);
            penyebut = Integer.parseInt(angkaPisah[1]);
            desimal = (double) pembilang/penyebut;
            int a = 1;
            while (a <= 10) {
                if (desimal*a == (int) (desimal*a)) {
                    pembilang = (int) (desimal*a);
                    penyebut = a;
                    break;
                }
                a++;
            }
        } else if (angkaPisah.length == 3) {
            angkaAwal = Integer.parseInt(angkaPisah[0]);
            pembilang = Integer.parseInt(angkaPisah[1]);
            penyebut = Integer.parseInt(angkaPisah[2]);
            
            desimal = angkaAwal + (double)pembilang/penyebut;
            angkaUtuh = angkaAwal;
            int a = 1;
            while (a <= 10) {
                if (desimal*a == (int) (desimal*a)) {
                    pembilang = (int) (desimal*a);
                    penyebut = a;
                    break;
                }
                a++;
            }
        } else {
            System.out.println("Inputan tidak valid. Silahkan Masukkan Angka Baru.");
        }
        
        sisaPec = pembilang%penyebut;
        angkaUtuh = pembilang/penyebut;
        
        if (pembilang == 0) {
            System.out.printf("Desimal: %.0f\n",desimal);
            System.out.println("Pecahan campuran: 0");
            System.out.println("Pecahan: 0");
        } else if (angkaPisah.length == 1 && pembilang != 0) {
            System.out.println("Desimal: " + desimal);
            System.out.println("Pecahan campuran: " + angkaUtuh + " " + sisaPec + "/" + penyebut);
            System.out.println("Pecahan: " + pembilang + "/" + penyebut);
        } else if (angkaPisah.length == 2 && pembilang%penyebut != 0) {
            System.out.println("Desimal: " + desimal);
            System.out.println("Pecahan campuran: " + pembilang + "/" + penyebut);
            System.out.println("Pecahan: " + pembilang + "/" + penyebut);
        } else if (angkaPisah.length == 3) {
            System.out.println("Desimal: " + desimal);
            System.out.println("Pecahan campuran: " + angkaAwal + " " + sisaPec + "/" + penyebut);
            System.out.println("Pecahan: " + ((angkaUtuh*penyebut) + sisaPec) + "/" + penyebut);
        } else {
            System.out.println("Desimal: " + desimal);
            System.out.println("Pecahan campuran: " + desimal);
            System.out.println("Pecahan: " + desimal);
        }
        
        input.close();
    }
}
    
