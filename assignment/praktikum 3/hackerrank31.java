import java.util.Scanner;

public class hackerrank31 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        
        int umur = input.nextInt();
        if (umur >=0 && umur <=12){
            System.out.println("Anak-anak");
        }else if (umur >13 && umur <=17){
            System.out.println("Remaja");
        }else if (umur >17 && umur <=59){
            System.out.println("Dewasa");
        }else {
            System.out.println("Lansia");
        }
        input.close();
    }
}
