import java.util.*;

public class ganjilgenap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        
        if (x%2 == 0) {
            System.out.println("iki nomer Genap");
        } else {
            System.out.println("iki nomer Ganjil");
        }
    }
}
