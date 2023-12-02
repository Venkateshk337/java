import java.util.Scanner;

public class reversing {
    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int array[] = new int[10];
        int i = 0;
        System.out.println("Enter array elements");
        for (i = 0; i < number; i++) {
            array[i] = sc.nextInt();
        }
        for (i = 0; i < (number / 2); i++) {
            int temp = array[i];
            array[i] = array[number - i - 1];
            array[number - i - 1] = temp;
        }
        for (i = 0; i < number; i++) {
            System.out.print(array[i] + " ");
        }
        sc.close();
    }
}
