import java.util.Scanner;

public class hackerrank42 {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
        
        String tanggal = input.nextLine();
        String prodi = tanggal.substring(0, 2).toUpperCase();
        String warnaKotak = input.nextLine();
        
        int registrasi = Integer.parseInt(tanggal.substring(3, 5));
        
        String jenisOlahraga = "";
        String status = "";
        
        switch(prodi){
            case "TI":
                if (warnaKotak.equalsIgnoreCase("Merah")&&registrasi <= 15){
                    jenisOlahraga = "Basket";
                    status = "Diterima";
                } else if (warnaKotak.equalsIgnoreCase("Merah")&&registrasi > 15){ 
                    jenisOlahraga = "Basket";
                    status = "Ditolak";
                } else if (warnaKotak.equalsIgnoreCase("Biru")&&registrasi <= 15){
                    jenisOlahraga = "Futsal";
                    status = "Diterima";
                } else if (warnaKotak.equalsIgnoreCase("Biru")&&registrasi > 15){
                    jenisOlahraga = "Futsal";
                    status = "Ditolak";
                } else {
                    jenisOlahraga = "Tidak Valid untuk Teknologi Informasi";
                } break;
                
            case "SI":
                if (warnaKotak.equalsIgnoreCase("Biru")&&registrasi <= 10){
                    jenisOlahraga = "Basket";
                    status = "Diterima";
                } else if (warnaKotak.equalsIgnoreCase("Biru")&&registrasi > 10){ 
                    jenisOlahraga = "Basket";
                    status = "Ditolak";
                } else if (warnaKotak.equalsIgnoreCase("Merah")&&registrasi <= 10){ 
                    jenisOlahraga = "Futsal";
                    status = "Diterima";
                } else if (warnaKotak.equalsIgnoreCase("Merah")&&registrasi > 10){ 
                    jenisOlahraga = "Futsal";
                    status = "Ditolak";
                } else {
                    jenisOlahraga = "Tidak Valid Untuk Semua Sistem Informasi";
                } break;
            default:
                jenisOlahraga = "Prodi tidak dikenal";
                status = "Ditolah";
                    
        }
        System.out.println(jenisOlahraga);
        System.out.println(status);
        input.close();
    }
}
