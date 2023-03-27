import java.util.*;
import java.lang.Math;

public class gajiBersihKaryawan {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int gb, gp, t, p;

        System.out.print("Gaji Pokok = ");
        gp = input.nextInt();
        t = 1000000;
        System.out.println("Tunjangan = " + t);
        p = (int) ((gp + t) * 0.1);
        System.out.println("Pajak = " + p);
        gb = gp + t - p;
        System.out.println("Gaji Bersih Karyawan = " + gb);
    }
}
