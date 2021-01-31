import java.util.*;

public class luassegitiga {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int t = scan.nextInt();

        double luas = (double) (a*t) / 2;
        System.out.printf("%.2f", luas);
    }
}
