import java.util.Scanner;

public class kuis2 {
    public static void main(String args[]) {
        Scanner masuk = new Scanner(System.in);
        int bil, ang, n;
        System.out.print("Masukan banyaknya bil = ");
        n = masuk.nextInt();
        bil = 0;
        do {
            ang = 0;
            while (ang <= 2) {
                System.out.println(bil + " dan " + ang);
                ang++;
            }
            bil += 5;
        } while (bil <= n);
    }
}
