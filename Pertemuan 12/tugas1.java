import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);

        int ttl = 0;
        String pj, pp, j;
        boolean pl = true;

        System.out.println("Jenis Kursus : ");
        System.out.println("1.Masak");
        System.out.println("2.Jahit");
        System.out.println("3.MakeUp");
        System.out.print("Pilih Jenis : ");
        pj = masuk.nextLine();

        switch (pj) {
            case "Masak":
                System.out.println("Jenis Paket");
                System.out.println("A (6x praktek) Rp.500.000");
                System.out.println("B (8x praktek) Rp.650.000");
                System.out.print("Pilih Paket : ");
                pp = masuk.nextLine();

                switch (pp) {
                    case "A":
                        ttl = ttl + 500000;
                        break;

                    case "B":
                        ttl = ttl + 650000;
                        break;

                    default:
                        System.out.print("Salah pilihan");
                }
                break;

            case "Jahit":
                System.out.println("Jenis Paket");
                System.out.println("A (6x praktek) Rp.450.000");
                System.out.println("B (8x praktek) Rp.600.000");
                System.out.print("Pilih Paket : ");
                pp = masuk.nextLine();

                switch (pp) {
                    case "A":
                        ttl = ttl + 450000;
                        break;

                    case "B":
                        ttl = ttl + 600000;
                        break;

                    default:
                        System.out.print("Salah pilihan");
                }
                break;

            case "MakeUp":
                System.out.println("Jenis Paket");
                System.out.println("A (6x praktek) Rp.400.000");
                System.out.println("B (8x praktek) Rp.550.000");
                System.out.print("Pilih Paket : ");
                pp = masuk.nextLine();

                switch (pp) {
                    case "A":
                        ttl = ttl + 400000;
                        break;

                    case "B":
                        ttl = ttl + 550000;
                        break;

                    default:
                        System.out.print("Salah pilihan");
                }
                break;

            default:
                System.out.println("Salah pilih Kursus");
        }

        System.out.print("Ingin kursus jenis lain ? (y/t) : ");
        j = masuk.nextLine();

        if (j.equals("t")) {
            pl = false;
        }
        System.out.println("Total Bayar = " + ttl);
    }
}
