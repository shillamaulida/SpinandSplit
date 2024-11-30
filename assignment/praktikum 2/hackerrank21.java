import java.util.Scanner;

public class hackerrank21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int tinggi = 5 + (n - 1) * (n - 1) + (n - 1);
        System.out.println(tinggi); 
        input.close();
    }
}
