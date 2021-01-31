/**
 * pln
 */
import java.util.*;

public class pln {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //input
        System.out.println("Program penghitung pemakaian listrik sederhana");

        System.out.println("Masukkan Nama                   : ");
            String nama = scan.nextLine();

        System.out.println("Kelurahan                       : ");
            String kelurahan = scan.nextLine();

        System.out.println("Masukkan posisi awal Kwh Meter  : ");
            int awalKwh = scan.nextInt();

        System.out.println("Masukkan posisi akhir Kwh Meter : ");
            int akhirKwh = scan.nextInt();

        System.out.println("Masukkan biaya beban saat ini   : ");
            int biaya = scan.nextInt();

        System.out.println("Masukkan PPJ (dalam persen)     : ");
            int ppj = scan.nextInt();
        
        //rumus
        int pemakaian = akhirKwh - awalKwh;
        int tarif     = biaya * pemakaian;
        int pj        = tarif / ppj;
        int total     = tarif + pj;

        //output
        System.out.println("===================PLN Java===================");
        System.out.println("Nama                : " + nama);
        System.out.println("Kelurahan           : " + kelurahan);
        System.out.println("Pemakaian bulan ini : " + pemakaian + " " + "Kwh Meter");
        System.out.println("Tarif Listrik       : " + "Rp " + tarif + ",-");
        System.out.println("PPJ 10%             : " + "Rp " + pj + ",-");
        System.out.println("Total Bayar         : " + "Rp " + total + ",-");
        System.out.println("==============================================");
    }
}