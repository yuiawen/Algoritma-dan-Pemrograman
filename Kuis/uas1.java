import java.util.Scanner;

public class uas1 {
	public static void main(String args[]) {
		Scanner masuk = new Scanner(System.in);
		int toefl, tinggi;
		float ipk;
		System.out.print("Masukkan IPK Anda : ");
		ipk = masuk.nextFloat();
		if (ipk >= 3.75 && ipk <= 4.00) {
			System.out.println("Anda diterima");
		} else if (ipk < 3.75 && ipk >= 3.00) {
			System.out.print("Masukkan nilai TOEFL Anda : ");
			toefl = masuk.nextInt();
			System.out.print("Masukkan tinggi badan Anda : ");
			tinggi = masuk.nextInt();
			if (toefl > 450 && tinggi > 165)
				System.out.println("Anda diterima");
			else
				System.out.println("Anda tidak diterima");
		} else if (ipk < 3.00) {
			System.out.print("Masukkan nilai TOEFL Anda : ");
			toefl = masuk.nextInt();
			System.out.print("Masukkan tinggi badan Anda : ");
			tinggi = masuk.nextInt();
			if (toefl >= 500 && tinggi > 175)
				System.out.println("Anda diterima");
			else
				System.out.println("Anda tidak diterima");
		} else {
			System.out.println("Salah Masukkan IPK");
		}
	}
}
