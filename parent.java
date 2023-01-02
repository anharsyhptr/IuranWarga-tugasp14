import java.util.Scanner;
public class parent {
    Scanner as = new Scanner(System.in);
    String nama,nik,alamat,nhp;

    
    void isiData(String Nama_Warga,String Nik_Warga) {
        nama = Nama_Warga;
        nik = Nik_Warga;
    }
    String masukanNama(){
        return nama;
    }
    String masukanNik(){
        return nik;
    }
    String pekerjaan,akantor;
    String status,nmpasangan, jmlank;

    void info_warga(){
        parent a = new parent();
        System.out.println("--------------------oOo--------------------");
        System.out.println("***Data Warga *** ");
        System.out.println("Masukan nama = ");
        String nama = as.nextLine();
        System.out.println("Masukan NIK = ");
        String nik= as.nextLine();
        a.isiData(nama, nik);
        System.out.println("Masukan Alamat = ");
        String alamat = as.nextLine();
        System.out.println("Masukan No. Tlp = ");
        String nhp = as.nextLine();
        System.out.println("--------------------oOo--------------------");
        System.out.println("*** Data Pekerjaan *** ");
        System.out.println("Masukan Pekerjaan = ");
        String pekerjaan = as.nextLine();
        System.out.println("Masukan Alamat Kantor = ");
        String akantor = as.nextLine();
        System.out.println("--------------------oOo--------------------");
        System.out.println("*** Data Status *** ");
        System.out.println("Masukan Status = ");
        String status = as.nextLine();
        System.out.println("Masukan Nama Suami/Istri = ");
        String nmpasangan = as.nextLine();
        System.out.println("Masukan Jumlah Anak = ");
        String jmlank = as.nextLine();

        System.out.println("Lanjutkan Bayar Iuran ? ");
        child h2 = new child();
        String Lanjut=as.nextLine();
        if (Lanjut.equals("ya")|| Lanjut.equals("Ya")|| Lanjut.equals("Y")|| Lanjut.equals("y")){
                h2.info_warga2();
        }
    }
}




