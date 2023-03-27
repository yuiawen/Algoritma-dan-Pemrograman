ram 1.

import java.util.Scanner;2.

public class Gabung4 {
   public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      int awal, akhir;
      System.out.print("masukkan nilai awal : ");
      awal = in.nextInt();
      System.out.print("masukkan nilai akhir : ");
      akhir = in.nextInt();
      for (int x = awal; x <= akhir; x++) {
         if (x % 2 == 0) {
            System.out.println(x + " adalah bilangan genap");
         } else {
            System.out.println(x + " adalah bilangan ganjil");
         }
      }
   }
}