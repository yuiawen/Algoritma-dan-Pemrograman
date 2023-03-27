import java.util.Scanner;
public class switch3 {

public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	int pil, jumlah, bayar;

	System.out.println("1. ekonomi 2. bisnis 3. eksekutif, masukkan pilihan : ");
	pil = input.nextInt();
	System.out.println("masukkan jumlah penumpang : ");
	jumlah = input.nextInt();
	switch(pil)
	{
	case 1:
		bayar = jumlah * 50000;
		System.out.println("bayar : "+bayar);
	break;
	case 2:
        bayar = jumlah * 70000;
        System.out.println("bayar : "+bayar);
    break;
	case 3:
        bayar = jumlah * 100000;
        System.out.println("bayar : "+bayar);
        break;
}
}
}
