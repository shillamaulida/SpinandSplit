import java.util.Scanner;

public class hackerrank53 {
    public static void main(String[] args) {
        Scanner ssh = new Scanner(System.in);
        
        int x = ssh.nextInt();
        int terjual = 0;
        int totaldiskon = 0;
        int penjualan = 0;
        int harga = 50000;
        
        for(int y = 0; y < x; y++) {
            int tiket = ssh.nextInt();
            terjual += tiket;
            
            int omsetawal = tiket * harga;
            penjualan += omsetawal;
            
            int diskon = 0;
            if (tiket >= 4 && tiket <=6) {
                diskon = (int)(omsetawal * 0.05);
            } else if (tiket >=7) {
                diskon = (int)(omsetawal * 0.10);
            }
            totaldiskon += diskon;
        }
        int untung = penjualan - totaldiskon;
        
        System.out.println("Total transaksi: " + x);
        System.out.println("Total tiket terjual: " + terjual);
        System.out.println("Total pendapatan: Rp " + penjualan);
        System.out.println("Total diskon: Rp " + totaldiskon);
        System.out.println("Pendapatan bersih: Rp " + untung);
        ssh.close();
    }
}
