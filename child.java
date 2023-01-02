import java.util.Scanner;
public class child extends parent{
    void info_warga2(){
        System.out.println("--------------------oOo--------------------");
        System.out.println("***Data Iuran Pokok***");
        System.out.println("NIK  => "+ super.masukanNik());
        System.out.println("Masukan Iuran Sampah");
        int is = as.nextInt();
        System.out.println("Masukan Iuran Keamanan");
        int ik = as.nextInt();

        System.out.println("***Data Iuran Sekunder***");
        System.out.println("Masukan Sumbangan");
        int sumbangan = as.nextInt();
        System.out.println("Lanjut Bayar Iuran ?");
        Scanner input = new Scanner(System.in);
        String Lanjut1 = "";
        Lanjut1=input.nextLine();
        child h2 = new child();
        if (Lanjut1.equals("tidak")|| Lanjut1.equals("Tidak")|| Lanjut1.equals("T")|| Lanjut1.equals("t")) {
            int total;
            total = is + ik + sumbangan;
            System.out.println("||NIK                           ||" + super.masukanNik());
            System.out.println();
            System.out.println("||Total Pembayaran Iuran Warga  ||Rp. " + total);
            System.out.println("Terimakasi " + super.masukanNama() + " Iuran Anda sudah di Bayarkan");
        }else if (Lanjut1.equals("ya")|| Lanjut1.equals("Ya")|| Lanjut1.equals("Y")|| Lanjut1.equals("y")){
            h2.info_warga2();
     }
    }
}

