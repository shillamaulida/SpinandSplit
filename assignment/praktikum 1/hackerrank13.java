import java.util.Scanner;

public class hackerrank13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        double tugas = input.nextDouble() / 100;
        double quiz = input.nextDouble() / 100;
        double uts = input.nextDouble() / 100;
        double uas = input.nextDouble() / 100;
        double keaktifan = input.nextDouble() / 100;
        double nilaiAkhir = (0.2 * tugas) + (0.1 * quiz) + (0.3 * uts) + (0.3 * uas) + (0.1 * keaktifan);
        
        int nilaiAkhirBulat = (int) Math.round(nilaiAkhir * 100);
        
        System.out.println("Nilai akhir: " + nilaiAkhirBulat);
        input.close();
    }
}
