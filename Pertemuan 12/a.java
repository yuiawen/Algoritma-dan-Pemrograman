import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);

        int ttl, b;
        String pj, pp, j;

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
                        System.out.print("Berapa banyak : ");
                        b = masuk.nextInt();
                        ttl = b * 500000;
                        break;

                    case "B":
                        b = masuk.nextInt();
                        ttl = b * 650000;
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
                        b = masuk.nextInt();
                        ttl = b + 450000;
                        break;

                    case "B":
                        b = masuk.nextInt();
                        ttl = b + 600000;
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
                        b = masuk.nextInt();
                        ttl = b + 400000;
                        break;

                    case "B":
                        b = masuk.nextInt();
                        ttl = b + 550000;
                        break;

                    default:
                        System.out.print("Salah pilihan");
                }
                break;

            default:
                System.out.println("Salah pilih Kursus");
        }
        System.out.println("Total Bayar = " + ttl);

    }
}