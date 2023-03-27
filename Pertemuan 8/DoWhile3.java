import java.util.Scanner;

public class DoWhile3 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int awal, akhir;
        System.out.print("masukkan nilai awal : ");
        awal = in.nextInt();
        System.out.print("masukkan nilai akhir : ");
        akhir = in.nextInt();
        int x = awal;
        do {
            System.out.println(x);
            x++;
        } while (x <= akhir);
    }
}