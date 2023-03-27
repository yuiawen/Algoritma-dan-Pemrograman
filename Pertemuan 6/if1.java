import java.util.*;

public class if1 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        char nilai;

        System.out.println("Masukan nilai");
        nilai = input.nextchar().charAt(0);
        if (nilai == 'a' || nilai =='a') {
            System.out.println("Lulus, Hebat sekali");
        } else {
            if (nilai.equals("B")) {
                System.out.println("Lulus, Hebat");
            } else {
                if (nilai.equals("C")) {
                    System.out.println("Lulus, Belajar lebih rajin");
                } else {
                    if (nilai.equals("D")) {
                        System.out.println("Lulus, nilai kurang");
                    } else {
                        if (nilai.equals("E")) {
                            System.out.println("Tidak lulus");
                        } else {
                            System.out.println("Salah masukan nilai");
                        }
                    }
                }
            }
        }
    }
}
