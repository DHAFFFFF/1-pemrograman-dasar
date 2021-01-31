import java.util.*;

public class jarakmanhattan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();

        int x, y;
        if ((x1 - x2) < 0) {
            x = (x1 - x2) * -1;
        } else {
            x = (x1 - x2);
        }
        if ((y1 - y2) < 0) {
            y = (y1 - y2) * -1;
        } else {
            y = (y1 - y2);
        }
        System.out.println(x + y);
    }
}
