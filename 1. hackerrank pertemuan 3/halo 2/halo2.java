import java.util.*;

public class halo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nama, jurusan, fakultas, nim, angkatan;

        nama = scan.nextLine();
        nim = scan.nextLine();
        jurusan = scan.nextLine();
        angkatan = scan.nextLine();
        fakultas = scan.nextLine();

        System.out.println("Halo! Nama saya " + nama + " dengan nim " + nim + " dari " + jurusan + " " + angkatan + " " + fakultas + ".");
    }
}
