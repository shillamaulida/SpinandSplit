import java.util.Scanner;

public class hackerrank33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double berat = input.nextDouble();
        double tinggi = input.nextDouble();
        double BMI = berat / (tinggi * tinggi);
        
        if (BMI < 18.5){
            System.out.printf("BMI Anda adalah: %.2f%n", BMI);
            System.out.println("Kategori : Berat badan kurang");
        }else if (BMI >= 18.5 && BMI <= 24.9){
            System.out.printf("BMI Anda adalah: %.2f%n", BMI);
            System.out.println("Kategori: Berat badan normal");
        }else if (BMI >= 25 && BMI <= 29.9){
            System.out.printf("BMI Anda adalah: %.2f%n", BMI);
            System.out.println("Kategori: Berat badan berlebih");
        }else {
            System.out.printf("BMI Anda adalah: %.2f%n", BMI);
            System.out.println("Kategori: Obesitas");
        }
        input.close();
    }
}
