import java.util.*;
import java.lang.Math;

public class Latihan {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int jam, menit, detik;
        
        System.out.println("Berapa Detik");
        detik = input.nextInt();
        jam = (int) ((double) detik / 3600);
        System.out.println("Jam = " + jam);
        menit = (int) ((double) detik / 60);
        System.out.println("Menit = " + menit);
    }
}
