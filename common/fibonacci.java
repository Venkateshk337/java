import java.util.*;

public class fibonacci {
    public static void main(String[] args) {
        System.out.println("enter the term:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int num1 = 0, num2 = 1;
        for (int i = 1; i <= a; i++) {
            System.out.print(num1 + ",");
            num1 = num1 + num2;
            int tem = num1;
            num1 = num2;
            num2 = tem;
        }
        sc.close();
    }
}
