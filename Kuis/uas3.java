import java.util.Scanner;

public class uas3 {
	public static void main(String args[]) {
		Scanner masuk = new Scanner(System.in);
		int awal, akhir;
		System.out.print("Masukkan batas awal : ");
		awal = masuk.nextInt();
		System.out.print("Masukkan batas akhir : ");
		akhir = masuk.nextInt();
		System.out.print("Deret : ");
		while (awal <= akhir) {
			if (awal % 4 == 0)
				System.out.print(awal + " ");
			awal++;
		}
		System.out.println();
	}
}
