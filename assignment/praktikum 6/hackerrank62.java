import java.util.Scanner;

public class hackerrank62 {
    public static void main(String[] args) {
           Scanner ssh = new Scanner(System.in);

        int jumlahSiswa = ssh.nextInt();
        int banyakLatihan = ssh.nextInt();
        ssh.nextLine(); 

        String mahasiswaTertinggi = "";
        float nilaiTertinggi = 0;
        float totalNilaiKelas = 0;

        for (int i = 0; i < jumlahSiswa; i++) {
            String input = ssh.nextLine();
            String[] data = input.split("\\s+");
            String namaMahasiswa = data[0];

            float totalNilai = 0;
            for (int j = 1; j <= banyakLatihan; j++) {
                totalNilai += Float.parseFloat(data[j]);
            }

            float rataRata = totalNilai / banyakLatihan;
            totalNilaiKelas += rataRata;

            System.out.printf("Rata-rata nilai mahasiswa %s adalah %.2f%n", namaMahasiswa, rataRata);

            if (rataRata > nilaiTertinggi) {
                nilaiTertinggi = rataRata;
                mahasiswaTertinggi = namaMahasiswa;
            }
        }

        float rataRataKelas = totalNilaiKelas / jumlahSiswa;

        System.out.printf("Rata-rata kelas: %.2f%n", rataRataKelas);
        System.out.printf("Mahasiswa yang memiliki nilai tertinggi adalah %s dengan nilai %.2f%n", mahasiswaTertinggi, nilaiTertinggi);
        ssh.close();
    }
}
