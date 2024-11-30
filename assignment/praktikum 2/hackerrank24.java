import java.util.Scanner;

public class hackerrank24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        
        double panjangsisi = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y1-y2,2));
        
        System.out.printf("%.2f%n", panjangsisi);
        scanner.close();
    }
}
