import java.util.Scanner;

public class latihanutp2 {
    public static void main(String[] args) {
         Scanner ssh = new Scanner(System.in);
        
        int n = ssh.nextInt();
        int x = ssh.nextInt();
        int m = ssh.nextInt();
        int d = ssh.nextInt();
        int totalTelur = (n * x * m * d);
        
        System.out.println(totalTelur);
        ssh.close();
    }
}
