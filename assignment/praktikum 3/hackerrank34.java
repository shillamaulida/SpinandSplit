import java.util.Scanner;

public class hackerrank34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int bulan = input.nextInt();
        if (bulan < 1 || bulan > 12){
            System.out.println("Nomor bulan tidak valid. Masukkan angka 1-12.");
        }
        
        input.nextLine();
        String belahan = input.nextLine();
        
        if (!belahan.equalsIgnoreCase("Utara") && !belahan.equalsIgnoreCase("Selatan")) {
            System.out.println("Belahan bumi tidak valid. Masukkan 'Utara' atau 'Selatan'."); 
        }
        
        String musim = "";
        if (belahan.equalsIgnoreCase("Utara")){
            if (bulan >= 3 && bulan <=5) {
                musim = "Musim Semi";
            } else if (bulan >=6 && bulan <=8) {
                musim = "Musim Panas";
            } else if (bulan >=9 && bulan <=11) {
                musim = "Musim Gugur";
            } else {
                musim = "Musim Dingin";
            }
        } else if (belahan.equalsIgnoreCase("Selatan")) {
            if (bulan >=3 && bulan <=5) {
                musim = "Musim Gugur";
            } else if (bulan >=6 && bulan <=8) {
                musim = "Musim Dingin";
            } else if (bulan >=9 && bulan <=11) {
                musim = "Musim Semi";
            } else {
                musim = "Musim Panas";
            }
        }
        
        System.out.println("Musim pada bulan " + bulan + " di belahan bumi " + belahan + " adalah: " + musim);
        input.close();
    }
}
