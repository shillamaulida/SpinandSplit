import java.util.Arrays;
import java.util.Scanner;

public class livecoding {
    public static void main(String[] args) {
        Scanner ssh = new Scanner(System.in);
        
        // Membaca jumlah mainan
        int N = ssh.nextInt();
        int[] prices = new int[N];
        
        // Membaca harga mainan
        for (int i = 0; i < N; i++) {
            prices[i] = ssh.nextInt();
        }
        
        // Mengurutkan harga mainan
        Arrays.sort(prices);
        
        // Menghitung selisih antara dua harga terendah
        int difference = prices[1] - prices[0];
        
        // Mencetak hasil
        System.out.println(difference);
        
        ssh.close();
    }
}
    
