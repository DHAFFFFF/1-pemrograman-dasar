import java.util.*;

public class strukkantin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //input
        int qtyAg = scan.nextInt();
        int qtyNg = scan.nextInt();
        int qtyNk = scan.nextInt();

        //rumus
        int hargaAg  = qtyAg * 13000;
        int hargaNg  = qtyNg * 10000;
        int hargaNk  = qtyNk * 5000;
        int hargaTot = hargaAg + hargaNg + hargaNk;

        //output
        System.out.println("=================================");
        System.out.println("    KANTIN PUJASERA FILKOM UB    ");
        System.out.println("=================================");
        System.out.println("MAKANAN           QTY   HARGA"); //System.out.println("MAKANAN           QTY   HARGA \n");
        System.out.println(" ");
        System.out.println("AYAM GORENG" + "       " + qtyAg + "     " + "Rp. " + hargaAg);
        System.out.println("NASI GORENG" + "       " + qtyNg + "     " + "Rp. " + hargaNg);
        System.out.println("NASI KECAP " + "       " + qtyNk + "     " + "Rp. " + hargaNk);
        System.out.println("=================================");
        System.out.println("TOTAL" + "                   " + "Rp. " + hargaTot);
        System.out.println("TERIMA KASIH TELAH BERBELANJA!!!");
    }
}
