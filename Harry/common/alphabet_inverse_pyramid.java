
public class alphabet_inverse_pyramid {
    public static void main(String[] args) {

        char a = 'H';
        char b = '@';
        char c = 'A';
        char i;
        for (i = a; i != b; i--) {

            for (char j = c; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

}
