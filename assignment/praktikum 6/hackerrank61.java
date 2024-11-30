import java.util.Scanner;

public class hackerrank61 {
    public static void main(String[] args) {
               Scanner ssh = new Scanner(System.in);
        String inputAngka = ssh.nextLine().trim();

        if (inputAngka.contains(" ")) {
            String[] pecahanCampuran = inputAngka.split(" ");
            int angkaBulatan = Integer.parseInt(pecahanCampuran[0]);
            String pecahan = pecahanCampuran[1];
            String[] pecahanSplit = pecahan.split("/");
            int pembilang = Integer.parseInt(pecahanSplit[0]);
            int penyebut = Integer.parseInt(pecahanSplit[1]);

            double nilaiDesimal = angkaBulatan + (double) pembilang / penyebut;

            int fpb = cariGCD(pembilang, penyebut);
            pembilang /= fpb;
            penyebut /= fpb;

            int totalPembilang = (angkaBulatan * penyebut) + pembilang;

            System.out.println("Desimal: " + nilaiDesimal);
            System.out.println("Pecahan campuran: " + angkaBulatan + " " + pembilang + "/" + penyebut);
            System.out.println("Pecahan: " + totalPembilang + "/" + penyebut);
        } else if (inputAngka.contains("/")) {
            String[] pecahanSplit = inputAngka.split("/");
            int pembilang = Integer.parseInt(pecahanSplit[0]);
            int penyebut = Integer.parseInt(pecahanSplit[1]);

            double nilaiDesimal = (double) pembilang / penyebut;

            int fpb = cariGCD(pembilang, penyebut);
            pembilang /= fpb;
            penyebut /= fpb;

            System.out.println("Desimal: " + nilaiDesimal);
            if (penyebut == 1) {
                System.out.println("Pecahan campuran: " + pembilang + ".0");
                System.out.println("Pecahan: " + pembilang + ".0");
            } else {
                int angkaBulatan = pembilang / penyebut;
                int sisaPembilang = pembilang % penyebut;
                if (angkaBulatan > 0) {
                    System.out.println("Pecahan campuran: " + angkaBulatan + " " + sisaPembilang + "/" + penyebut);
                } else {
                    System.out.println("Pecahan campuran: " + pembilang + "/" + penyebut);
                }
                System.out.println("Pecahan: " + pembilang + "/" + penyebut);
            }
        } else {
            double nilaiDesimal = Double.parseDouble(inputAngka);
            int angkaBulatan = (int) nilaiDesimal;
            double pecahan = nilaiDesimal - angkaBulatan;

            if (pecahan == 0) {
                System.out.println("Desimal: " + angkaBulatan);
                System.out.println("Pecahan campuran: " + angkaBulatan);
                System.out.println("Pecahan: " + angkaBulatan);
            } else {
                String[] pecahanSplit = String.valueOf(pecahan).split("\\.");
                int jumlahDesimal = pecahanSplit[1].length();
                int penyebut = (int) Math.pow(10, jumlahDesimal);
                int pembilang = (int) (nilaiDesimal * penyebut);

                int fpb = cariGCD(pembilang, penyebut);
                pembilang /= fpb;
                penyebut /= fpb;

                System.out.println("Desimal: " + nilaiDesimal);
                if (angkaBulatan > 0) {
                    System.out.println("Pecahan campuran: " + angkaBulatan + " " + (pembilang % penyebut) + "/" + penyebut);
                } else {
                    System.out.println("Pecahan campuran: " + pembilang + "/" + penyebut);
                }
                System.out.println("Pecahan: " + pembilang + "/" + penyebut);
            }
        }
        ssh.close();
    }

    private static int cariGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return cariGCD(b, a % b);
    }
}
