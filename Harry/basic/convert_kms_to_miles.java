import java.util.Scanner;

public class convert_kms_to_miles {
    public static void main(String[] args) {
        System.out.println("Enter the kms:");
        Scanner sc = new Scanner(System.in);
        double km = sc.nextInt();
        double miles = .6213 * km;
        System.out.println(km + "kms=" + miles + " miles");
        sc.close();
    }
}
