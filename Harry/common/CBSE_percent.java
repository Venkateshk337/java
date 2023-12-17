import java.util.Scanner;

public class CBSE_percent {
    public static void main(String[] args) {
        System.out.println("Enter five subject marks out of 100:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the maths marks:");
        int maths = sc.nextInt();
        System.out.println("Enter the physics marks:");
        int physics = sc.nextInt();
        System.out.println("Enter the Chemistry marks:");
        int Chemistry = sc.nextInt();
        System.out.println("Enter the Biology marks:");
        int Biology = sc.nextInt();
        System.out.println("Enter the Kannada marks:");
        int Kannada = sc.nextInt();
        float sum = maths + physics + Chemistry + Biology + Kannada;
        float average = sum * 100 / 500;
        System.out.println("Average of five subjects is:" + average);
        sc.close();
    }
}
