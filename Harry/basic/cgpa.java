import java.util.Scanner;

public class cgpa {
    public static void main(String[] args) {
        System.out.println("Enter three subject marks out of 100");
        Scanner sc = new Scanner(System.in);
        int maths = sc.nextInt();
        int chemistry = sc.nextInt();
        int english = sc.nextInt();
        double sum = maths + chemistry + english;
        double gpa = sum / 30;
        System.out.println("CGPA is "+gpa);
        sc.close();
    }
}
