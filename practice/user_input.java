import java.util.*;

public class user_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name1 = sc.nextLine();
        String name = sc.next();
        System.out.println(name);
        System.out.println(name1);
        sc.close();
    }
}
