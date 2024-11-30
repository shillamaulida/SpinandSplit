import java.util.Scanner;

public class hackerrank12 {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
            
        Double reamur = input.nextDouble();
        Double celcius = 5.0 / 4.0 * reamur;
        Double kelvin = 5.0 / 4.0 * reamur + 273;
        Double fahrenheit = 9.0 / 4.0 * reamur + 32;
        
        System.out.println("Suhu dalam Reamur: " + String.format("%.1f", reamur) + " R");
        System.out.println("Suhu dalam Celcius: " + String.format("%.1f", celcius) + " C");
        System.out.println("Suhu dalam Kelvin: " + String.format("%.1f", kelvin) + " K");
        System.out.println("Suhu dalam Fahrenheit: " + String.format("%.1f", fahrenheit) + " F");
        input.close();
    }
}
