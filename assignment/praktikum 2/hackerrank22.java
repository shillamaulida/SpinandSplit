import java.util.Scanner;

public class hackerrank22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        
        double Luas = Math.abs(x1 * (y2-y3) + x2 * (y3-y1) + x3 * (y1-y2))/ 2;
            
        System.out.printf("%.2f%n", Luas );
        input.close();
    }
}
