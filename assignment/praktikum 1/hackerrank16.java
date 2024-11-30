import java.util.Scanner;

public class hackerrank16 {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        int hundreds = number / 100;
        int tens = (number % 100) / 10;
        int units = number % 10;

        int digitSum = hundreds + tens + units;

        System.out.println(digitSum);
        input.close();
    }
}
