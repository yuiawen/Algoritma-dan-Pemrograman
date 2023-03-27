import java.util.Scanner;

public class while4 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int awal, akhir;
        System.out.print("masukkan nilai awal : ");
        awal = in.nextInt();
        System.out.print("masukkan nilai akhir : ");
        akhir = in.nextInt();
        int x = awal;
        while (x <= akhir) {
            System.out.println(x);
            x++;
        }
    }
}
