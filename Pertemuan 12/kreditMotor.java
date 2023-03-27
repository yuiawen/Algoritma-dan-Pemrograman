import java.util.Scanner;

public class kreditMotor {
    Scanner masuk = new Scanner(System.in);
    Scanner masuk2 = new Scanner(System.in);

    int pMenu, totalHarga, total, fMerk, fAngsuran, fKode, fkPembayaran;
    String pKembali, fNama, fAlamat, fPembayaran, fsMerk, fsKode;
    long fPhone;

    public void menu() {
        System.out.println(
                "==============================\n|Selamat Datang Di HSn Dealer|\n==============================");
        System.out.println("Silahkan pilih menu yang tersedia\n");
        System.out.println("1. Daftar Merek motor\n2. Daftar Harga Motor\n3. Formulir pembelian Motor\n4. Keluar");

        System.out.print("Silahkan masukan menu pilihan : ");
        pMenu = masuk.nextInt();
        switch (pMenu) {
            case 1:
                System.out.println("--------------------");
                daftarMotor();
                break;
            case 2:
                System.out.println("--------------------");
                daftarHarga();
                break;
            case 3:
                formBeli();
                break;
            case 4:
                System.out.println("Terimakasih");
                break;
            default:
                System.out.println("Menu Tidak tersedia");
                break;
        }
    }

    public void menuKembali() {
        System.out.print("Kembali ke menu utama [y/n] : ");
        pKembali = masuk.next();
        switch (pKembali) {
            case "y":// hasil scanner yang diinput y maka akan kembali ke menu
                System.out.println();
                menu();
                break;
            case "n":
                System.out.println("Terimakasih");// hasil input n maka akan keluar dan menampilkan terimakasih
                break;
            default:
                System.out.println("Pilihan tidak tersedia");// selain input selain y atau n maka akan menampilkan
                                                             // pilihan tidak tersedia
                break;
        }
    }

    public void daftarMotor() {
        System.out.println("Daftar Merk Motor");
        System.out.println("1. Honda\n2. Yamaha\n3. Suzuki");
        System.out.print("Silahkan pilih merk motor [1-3]: ");
        pMenu = masuk.nextInt();

        switch (pMenu) {
            case 1:
                System.out.println("--------------------\nDaftar tipe motor merk Honda");
                System.out.println("1. All New Supra GTR 150 Sporty [H01]\n2. Honda New Sonic 150R [H02]");// input 1
                                                                                                           // sama
                                                                                                           // dengan
                                                                                                           // honda, dan
                                                                                                           // akan
                                                                                                           // menampilan
                                                                                                           // daftar
                                                                                                           // motor
                                                                                                           // honda
                menuKembali();
                break;

            case 2:
                System.out.println("--------------------\nDaftar tipe motor merk Yamaha");
                System.out.println("1. Jupiter Mx King 150 [Y01]\n2. Vega Force[Y02]\n3. Jupiter Z1[Y03]");// input 2
                                                                                                           // sama
                                                                                                           // dengan
                                                                                                           // yamaha,
                                                                                                           // dan akan
                                                                                                           // menampilan
                                                                                                           // daftar
                                                                                                           // motor
                                                                                                           // yamaha
                menuKembali();
                break;

            case 3:
                System.out.println("--------------------\nDaftar tipe motor merk Suzuki");
                System.out.println("1. All New Satria F150 Standard Version [S01]");
                menuKembali();
                break;

            default:
                System.out.println("Menu Tidak tersedia");
                break;
        }
    }

    public void daftarHarga() {
        System.out.println("Daftar Harga Motor");
        System.out.println(
                "1. Honda\n   1. H01 Rp.21.550.000(Tunai)/Rp.22.550.000(Kredit)\n   2. H02 Rp.21.850.000(Tunai)/Rp.22.850.000(Kredit)");
        System.out.println(
                "2. Yamaha\n   1. Y01 Rp.21.000.000(Tunai)/Rp.22.000.000(Kredit)\n   2. Y02 Rp.15.350.000(Tunai)/Rp.16.350.000(Kredit)\n   3. Y03 Rp.16.900.000(Tunai)/Rp.17.900.000(Kredit)");
        System.out.println("3. Suzuki\n   1. S01 Rp.21.650.000(Tunai)/Rp.22.650.000(Kredit)");
        menuKembali();
    }

    public void kodeMotor() {
        if (fMerk == 1) { // 1 = Honda
            switch (fKode) {
                case 1:
                    fsKode = "All New Supra GTR 150 Sporty [H01]";
                    totalHarga = 21550000;
                    break;
                case 2:
                    fsKode = "Honda New Sonic 150R [H02]";
                    totalHarga = 21850000;
                    break;
                default:
                    fsKode = " - ";
                    break;
            }
        } else if (fMerk == 2) { // 2 = Yamaha
            switch (fKode) {
                case 1:
                    fsKode = "Jupiter Mx King 150 [Y01]";
                    totalHarga = 21000000;
                    break;
                case 2:
                    fsKode = "Vega Force [Y02]";
                    totalHarga = 15350000;
                    break;
                case 3:
                    fsKode = "Jupiter Z1[Y03]";
                    totalHarga = 16900000;
                    break;
                default:
                    fsKode = " - ";
                    break;
            }
        } else if (fMerk == 3) { // 3 = Suzuki
            switch (fKode) {
                case 1:
                    fsKode = "All New Satria F150 Standard Version [S01]";
                    totalHarga = 21650000;
                    break;
                default:
                    fsKode = " - ";
                    break;
            }
        } else {
            fsKode = " - ";
            totalHarga = 0;
        }
    }

    public void caraBayar() {
        if (totalHarga == 0) {
            System.out.println("Rp. - ");
        } else {
            switch (fkPembayaran) { // fkPembayaran = tunai
                case 0:
                    kodeMotor();
                    System.out.println("Rp. " + totalHarga);
                    break;
                case 1:
                    kodeMotor(); // Kredit
                    totalHarga = totalHarga + 1000000;
                    totalHarga = totalHarga / fAngsuran;
                    System.out.println("Rp. " + totalHarga + "/bulan Selama " + fAngsuran + " Bulan");
                    break;
                default:
                    break;
            }
        }
    }

    public void detailForm() {
        System.out.print("Tipe Pembayaran [tunai/kredit]: ");
        fPembayaran = masuk.next();// Input data dengan tipe data String
        switch (fPembayaran) {
            case "kredit":
                System.out.print("Lama angsuran [6/12/24] bulan : ");
                fAngsuran = masuk.nextInt();
                fkPembayaran = 1;
                break;
            default:
                fkPembayaran = 0;
                break;
        }

        System.out.println(
                "\n========================================\nDetail Form Pembelian Motor\n========================================\n");
        System.out.println("Nama Lengkap    : " + fNama);
        System.out.println("Alamat Lengkap  : " + fAlamat);
        System.out.println("Nomor HandPhone : " + fPhone);
        System.out.println("Merk            : " + fsMerk);
        System.out.println("Kode/Tipe Motor : " + fsKode);
        System.out.println("=======================================");
        System.out.print("Total bayar     : ");
        caraBayar();
        System.out.println("=======================================");
    }

    public void formBeli() {
        System.out.print("\nNama Lengkap : "); // Input data dengan tipe data String
        fNama = masuk2.nextLine();

        System.out.print("Alamat : ");// Input data dengan tipe data String
        fAlamat = masuk2.nextLine();

        System.out.print("Nomor HandPhone : ");// Input data dengan tipe data Long
        fPhone = masuk2.nextLong();

        System.out.println("Merk Motor\n    1. Honda\n    2. Yamaha\n    3. Suzuki");
        System.out.print("Pilih Merk [1-3]: ");
        fMerk = masuk2.nextInt();// Input data dengan tipe data Int

        switch (fMerk) {
            case 1:
                fsMerk = "Honda";
                System.out.println("    1. H01\n    2. H02");
                System.out.print("Pilih Tipe : ");
                fKode = masuk2.nextInt();
                kodeMotor();
                detailForm();
                break;
            case 2:
                fsMerk = "Yamaha";
                System.out.println("    1. Y01\n    2. Y02\n    3. Y03");
                System.out.print("Pilih Tipe : ");
                fKode = masuk2.nextInt();
                kodeMotor();
                detailForm();
                break;
            case 3:
                fsMerk = "Suzuki";
                System.out.println("    1. S01");
                System.out.print("Pilih Tipe : ");
                fKode = masuk2.nextInt();
                kodeMotor();
                detailForm();
                break;
            default:
                fsMerk = " - ";
                System.out.println("Tipe motor tidak terdaftar");
                break;
        }
    }

    public static void main(String[] args) {
        kreditMotor pf = new kreditMotor();

        pf.menu();
    }

}
