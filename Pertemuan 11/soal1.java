public class soal1 {
    public static void main(String[] args) {
        int i, a;
        a = 0;
        for (i = 1; i <= 5; i++) {
            if (i == 4)
                break;
            a = a + i;
        }

        System.out.print(a);
    }
}
