import java.util.*;

public class prime {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int prime = 0;
        if (num == 1 || num == 0)
            System.out.println("Enter number " + num + " is not prime number");
        else if (num == 2)
            System.out.println("Enter number " + num + " is prime number");
        else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0)
                    prime = 1;
            }
            if (prime == 1)
                System.out.println("Enter number " + num + " is not prime number");
            else if (prime == 0)
                System.out.println("Enter number " + num + " is prime number");
        }
        sc.close();
    }
}
