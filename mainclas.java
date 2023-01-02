import java.util.Scanner;
public class mainclas {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("Pendataan dan Pembayaran Iuran Warga");
        System.out.println("====================================");

        System.out.println("1. Input Data Warga");
        System.out.println("2. Input Iuran Warga");

        System.out.println(" PILIHAN MENU : ");

        int pilihan = sc.nextInt();
        parent h = new parent();
        child h2 = new child();
        if (pilihan == 1){
            h.info_warga();
        }else if (pilihan == 2){
            h2.info_warga2();
        }
    }

}