import java.util.Scanner;

public class tugas2 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int x, batas;
        System.out.print("Masukkan batas : ");
        batas = in.nextInt();
        System.out.print("Deret : ");
        for (x = 1; x <= batas; x++) {
            if (x % 2 == 1) {
                if (x % 3 == 0)
                    System.out.print(x + " ");
            }
        }
    }
}
