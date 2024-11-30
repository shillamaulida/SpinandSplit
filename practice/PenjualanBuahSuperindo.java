import java.util.Scanner;
public class PenjualanBuahSuperindo {
    public static void main(String[] args) {
        String[][] dataBuah = {{"A01", "4500"}, {"B02", "2500"}, {"C03", "4000"}};
        Scanner ssh = new Scanner(System.in);

        System.out.println("Selamat datang di Superindo! Lagi nyari buah, ya? Yuk, cek daftar buah kami.");
        System.out.println("Kode Buah yang tersedia:");
        System.out.println("A01 - Apel, Rp 4.500/g");
        System.out.println("B02 - Pisang, Rp 2.500/g");
        System.out.println("C03 - Jeruk, Rp 4.000/g");

        boolean lanjutBelanja = true;
        int totalBelanja = 0; 

        while (lanjutBelanja) {
            System.out.print("\nMasukkan kode buah yang mau dibeli atau ketik '0' kalau udah selesai belanja: ");
            String kodeBuah = ssh.nextLine();
            if (kodeBuah.equals("0")) {
                lanjutBelanja = false;
                System.out.println("\nSip, selesai belanjanya ya? Ayo cek total belanjaannya.");
                break;
            }

            System.out.print("Masukkan berat buah (g): ");
            double beratBuah = ssh.nextDouble();

            int indexBuah = -1;
            for (int i = 0; i < dataBuah.length; i++) {
                if (dataBuah[i][0].equals(kodeBuah)) {
                    indexBuah = i;
                    break;
                }
            }

            if (indexBuah != -1) {
                int hargaPerGram = Integer.parseInt(dataBuah[indexBuah][1]);
                int totalHargaBuah = (int)(beratBuah * hargaPerGram);
                totalBelanja += totalHargaBuah;
                
                System.out.println("Oke, total untuk buah ini adalah: Rp " + totalHargaBuah);
                System.out.println("Mantap, ada lagi yang mau ditambahin?");
            } else {
                System.out.println("Wah, kode buahnya nggak ada nih. Coba periksa lagi ya.");
            }

            ssh.nextLine(); 
        }

        System.out.println("\nTotal keseluruhan belanjaan Anda adalah: Rp " + totalBelanja);
        System.out.println("Terima kasih sudah belanja di Superindo! Semoga hari Anda menyenangkan!");
        ssh.close();
    }
}
