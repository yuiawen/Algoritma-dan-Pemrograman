import java.util.Scanner;

public class uas2 {
    public static void main(String args[]) {
        Scanner masuk = new Scanner(System.in);
        int bil, ang, n;
        System.out.print("Masukan banyaknya bil = ");
        n = masuk.nextInt();
        for (bil = 0; bil <= n; bil += 5)
            for (ang = 0; ang <= 2; ang++)
                System.out.println(bil + " dan " + ang);
    }
}
