import java.util.Scanner;

public class hackerrank32 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        
        int tahun = input.nextInt();
        if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0 )) {
            System.out.println(tahun + " adalah tahun kabisat");
        }else {
            System.out.println(tahun + " bukan tahun kabisat");
        }       
        input.close(); 
    }
    }

