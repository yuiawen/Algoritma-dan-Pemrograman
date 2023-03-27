import java.util.*;
import java.lang.Math;

public class rata {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int i, n, jum, x, rata;

        System.out.println("Banyak data : ");
        n = input.nextInt();
        i = 1;
        jum = 0;
        x = 0;
        for (i = i; i <= n; i++) {
            System.out.println("Data ke- : " + i);
            x = input.nextInt();
            jum = jum + x;
        }
        System.out.println("Jumlah : " + jum);
        rata = (int) ((double) jum / n);
        System.out.println("Rata-Rata : " + rata);
    }
}
