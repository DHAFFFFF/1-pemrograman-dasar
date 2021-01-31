/**
 * kalkulator
 */
import java.util.*;

public class kalkulator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //input
        int angka1, angka2;
        System.out.println("Masukkan operator pertama :");
            angka1 = scan.nextInt();
        System.out.println("Masukkan operator kedua   :");
            angka2 = scan.nextInt();
        
        //rumus
        //int plus, min, kali;
        //double bagi;
        int plus = angka1 + angka2;
        int min  = angka1 - angka2;
        int kali = angka1 * angka2;
        double bagi = (double) angka1 / angka2;

        //output
        System.out.println("Hasil penjumahan          : " + plus);
        System.out.println("Hasil pengurangan         : " + min);
        System.out.println("Hasil perkalian           : " + kali); 
        System.out.println("Hasil pembagian           : " + bagi);
        //System.out.printf("Hasil pembagian           : " + "%.2f",bagi);
        //System.out.printf("Hasil pembagian           : " + String.format("%.2f",bagi));
    }
}