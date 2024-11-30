import java.util.Scanner;

public class hackerrank52 {
    public static void main(String[] args) {
         Scanner ssh = new Scanner(System.in);
        System.out.println("SELAMAT DATANG DI TEDDY'S BAKERY");
        System.out.println("LIST ROTI:");
        System.out.println("1. Roti Tawar - Rp 10.000,00");
        System.out.println("2. Roti Gandum - Rp 12.000,00");
        System.out.println("3. Roti Coklat - Rp 15.000,00");
        System.out.println("0. Keluar");
        
        int x = 0;
        boolean y = true;
        
        while (y) {
            System.out.println("Pilih order dan masukkan jumlah:");
            int z = ssh.nextInt();
            
            switch (z) {
                case 1:
                    double v = ssh.nextDouble();
                    x += 10000*v; break;
                case 2:
                    v = ssh.nextDouble();
                    x += 12000*v; break;
                case 3:
                    v = ssh.nextDouble();
                    x += 15000*v; break;
                case 0:
                    y = false; break;
                default:
                    System.out.println("Pilihan tidak ada!"); break;
            }
        }
        System.out.println("Total belanja: Rp "+ x +",00");
        System.out.println("TERIMA KASIH TELAH BERBELANJA DI TEDDY'S BAKERY");
        ssh.close();
    }
    }

