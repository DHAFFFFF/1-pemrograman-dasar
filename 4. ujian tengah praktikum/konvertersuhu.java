import java.util.*;

public class konvertersuhu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //input
        int n = scan.nextInt();
        
        //rumus
        double r = (double) 4/5 * n;
        double f = (double) 9/5 * n;
        double k = (double) n + 273;

        //output
        System.out.printf("Suhu Reamur : %.2f R \n", r);
        System.out.printf("Suhu Fahrenheit : %.2f F \n", f);
        System.out.printf("Suhu Kelvin : %.2f K \n", k);
    }
}
