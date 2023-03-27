public class while7 {
    public static void main(String args[]) {
        int jumlah = 0;
        int x = 1;
        while (x <= 5) {
            System.out.print(x + " ");
            jumlah = jumlah + x;
            x++;
        }
        System.out.println("");
        System.out.println("jumlah deret : " + jumlah);
    }
}
