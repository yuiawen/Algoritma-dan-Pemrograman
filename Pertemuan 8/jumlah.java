import java.util.Scanner;

public class jumlah {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int x, awal, akhir, jum;

        System.out.println("Bilangan awal : ");
        awal = input.nextInt();
        System.out.println("Bilangan akhir : ");
        akhir = input.nextInt();
        jum = 0;
        for (x = awal; awal <= akhir; x++) {
            jum = jum + x;
            System.out.println(x);
        }
        System.out.println("Jumlah : " + jum);
    }
}
