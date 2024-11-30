import java.util.Scanner;

public class hackerrank23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double jarakKM = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double biaya = jarakKM * 3000;
        
        System.out.printf("Biaya perjalanan dari titik (%.2f,%.2f) ke titik (%.2f,%.2f) adalah = Rp%.2f%n", x1, y1, x2, y2, biaya);
        scanner.close();
    }
}
