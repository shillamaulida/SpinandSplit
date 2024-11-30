import java.util.Scanner;

public class hackerrank15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int umurAyah = input.nextInt();
        int tahunLagi = input.nextInt();
        int umurKakak = umurAyah / 4; 
        int umurAdik = (umurKakak - 3) / 2;
        int umurIbu = umurAdik + (3 * umurKakak);

        System.out.println("Umur anggota keluarga saat ini adalah: ");
        System.out.println("Ayah: " + umurAyah + " tahun");
        System.out.println("Ibu: " + umurIbu + " tahun");
        System.out.println("Kakak: " + umurKakak + " tahun");
        System.out.println("Adik: " + umurAdik + " tahun");
        
        int umurAyahTahunLagi = umurAyah + tahunLagi; 
        int umurIbuTahunLagi = umurIbu + tahunLagi; 
        int umurKakakTahunLagi = umurKakak + tahunLagi; 
        int umurAdikTahunLagi = umurAdik + tahunLagi; 

        System.out.println("---------------");
        System.out.println("Umur anggota keluarga " + tahunLagi + " tahun lagi adalah:");
        System.out.println("Ayah: " + umurAyahTahunLagi + " tahun");
        System.out.println("Ibu: " + umurIbuTahunLagi + " tahun");
        System.out.println("Kakak: " + umurKakakTahunLagi + " tahun");
        System.out.println("Adik: " + umurAdikTahunLagi + " tahun");
        input.close();
    }
    }
