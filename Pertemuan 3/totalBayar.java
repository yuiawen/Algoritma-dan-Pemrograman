import java.util.*;
import java.lang.Math;

public class totalBayar {
    private static Scanner input = new Scanner(System.in);

    public static void main(S
    tring[] args) {
        int ap, ag, j, d, ts, tsd;

        ap = input.nextInt();
        ag = input.nextInt();
        j = input.nextInt();
        ts = ap * 33000 + ag * 4700 + j * 35000;
        d = (int) ((double) (ts * 5) / 100);
        tsd = ts - d;
        System.out.println(ts);
        System.out.println(d);
        System.out.println(tsd);
    }
}
