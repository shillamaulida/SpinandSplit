import java.util.Scanner;

public class hackerrank41 {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
        
        int angka1 = input.nextInt();
        String operator = input.next();
        int angka2 = input.nextInt();
        
        switch(operator) {
        case "+":
                System.out.println("Hasil: " + (angka1 + angka2));
                break;
        case "-":
                System.out.println("Hasil: " + (angka1 - angka2));
                break;
        case "*":
                System.out.println("Hasil: " + (angka1 * angka2));
                break;
        case "/":
                if (angka2 != 0) {
                    System.out.println("Hasil: " + (angka1 / angka2));
                }else {
                    System.out.println("Error: Pembagian dengan nol tidak diperbolehkan");
                }break;      
        default:
            System.out.println("Operasi tidak valid");
        }    
        input.close();
    }
}
