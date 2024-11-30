import java.util.Scanner;

public class hackerrak11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String nama = input.nextLine();
        String NIM = input.nextLine();
        String prodi = input.nextLine();
        String fakultas = input.nextLine();
        String angkatan = input.nextLine();
        
        System.out.println("Halo semua! Perkenalkan saya " + nama + " dengan NIM " + NIM + " dari prodi " + prodi + ", " + fakultas + " angkatan " + angkatan + ", siap menaklukan pemrograman dasar!");  
        input.close();   
    }
}
