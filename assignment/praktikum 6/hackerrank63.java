import java.util.Scanner;

public class hackerrank63 {
    public static void main(String[] args) {
          Scanner ssh = new Scanner(System.in);
        
        String line = ssh.nextLine().trim();
        String[] firstRow = line.split("\\s+");
        int N = firstRow.length; 
        int[][] matriks = new int[N][N];

        matriks[0] = new int[N];
        for (int j = 0; j < N; j++) {
            matriks[0][j] = Integer.parseInt(firstRow[j]);
        }

        for (int i = 1; i < N; i++) {
            line = ssh.nextLine().trim();
            String[] row = line.split("\\s+");
            for (int j = 0; j < N; j++) {
                matriks[i][j] = Integer.parseInt(row[j]);
            }
        }

        int diagonal1 = 0;
        int diagonal2 = 0;

        for (int i = 0; i < N; i++) {
            diagonal1 += matriks[i][i]; 
            diagonal2 += matriks[i][N - i - 1]; 
        }

        int beda = Math.abs(diagonal1 - diagonal2);

        System.out.println("Jumlah diagonal utama = " + diagonal1);
        System.out.println("Jumlah diagonal kedua = " + diagonal2);
        System.out.println("Selisih absolut = " + beda);
        
        ssh.close();
    }
}
