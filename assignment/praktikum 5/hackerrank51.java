import java.util.Scanner;

public class hackerrank51 {
    public static void main(String[] args) {
        Scanner ssh =  new Scanner(System.in);
        
        double x = 0;
        boolean y = true;
        
        while (y) {
            String z = ssh.next().toUpperCase();
                switch (z) {
                    case "TAMBAH":
                        double v = ssh.nextDouble();
                        x += v;
                        System.out.printf("%.1f%n", x); break;
                    case "KURANG":
                        v = ssh.nextDouble();
                        x -= v;
                        System.out.printf("%.1f%n", x); break;
                    case "KALI":
                        v = ssh.nextDouble();
                        x *= v;
                        System.out.printf("%.1f%n", x); break;
                    case "BAGI":
                        v = ssh.nextDouble();
                        if(v == 0){
                            x = 0;
                            System.out.printf("%.1f%n", x);
                            } else {
                            x /= v;
                            System.out.printf("%.1f%n", x);
                            } break;
                    case "SELESAI":
                        y = false;
                        System.out.printf("%.1f%n", x);break;
                    default:
                        ssh.nextLine();
                        System.out.printf("%.1f%n", x);
                        break;
            }
        }
        ssh.close();
    }
}
