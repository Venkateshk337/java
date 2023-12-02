public class alphabet_pyramid {
    public static void main(String[] args) {

        char a = 'H';
        char c = 'A';
        char i;
        for (i = c; i <= a; i++) {

            for (char j = c; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
