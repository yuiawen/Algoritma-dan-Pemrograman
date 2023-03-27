import java.util.*;
import java.lang.Math;

public class Lingkaran {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double r, l, k, d;

        System.out.println("masukkan jari-jari");
        r = input.nextDouble();
        l = 3.14 * r * r;
        k = 2 * 3.14 * r;
        d = 2 * r;
        System.out.println("Luas Lingkaran = " + l);
        System.out.println("Keliling Lingkaran = " + k);
        System.out.println("Diameter Lingkaran = " + d);
    }
}
