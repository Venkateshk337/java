
import java.util.*;

public class table {
    public static void main(String[] arg) {
        System.out.println("enetr multiplication table no:");
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i = 1;
        while (i <= 10) {
            System.out.println(t + "*" + i + "=" + (i * t));
            i++;
        }

    }

}
