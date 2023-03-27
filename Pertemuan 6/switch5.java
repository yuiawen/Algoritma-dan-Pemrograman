import java.util.*;

public class switch5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String nama;
		int pil;

		System.out.println("Masukan nama : ");
		nama = input.nextLine();
		System.out.println(
				"1. Informatika 2. Sistem Informasi 3. Bisnis digital 4. Manajemen Ritel 5. Teknik Komputer masukkan pilihan : ");
		pil = input.nextInt();
		switch (pil) {
			case 1:
				System.out.println("Nama Calon Mahasiswa : " + nama);
				System.out.println("Prodi : Informatika");
				break;
			case 2:
				System.out.println("Nama Calon Mahasiswa : " + nama);
				System.out.println("Prodi : Sistem Informasi");
				break;
			case 3:
				System.out.println("Nama Calon Mahasiswa : nama");
				System.out.println("Prodi : Bisnis Digital");
				break;
			case 4:
				System.out.println("Nama Calon Mahasiswa : " + nama);
				System.out.println("Prodi : Manajemen Ritel");
				break;
			case 5:
				System.out.println("Nama Calon Mahasiswa : " + nama);
				System.out.println("Prodi : Teknik Komputer");
				break;
			default:
				System.out.println("Salah Masukan Pilihan");
				break;
		}
	}
}
