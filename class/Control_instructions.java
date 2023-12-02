import java.util.*;

public class Control_instructions {
   public static void main(String[] arg) {
      System.out.println("Enter two number");
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      if (a == b) {
         System.out.println("a is equal to b");
      } else if (a != b) {
         if (a > b) {
            System.out.println("a is greater then b");
         } else if (a < b) {
            System.out.println("a is less than b");
         }
      }
      if (a >= b) {
         System.out.println("a is greater than or equal to b");
      } else if (a <= b) {
         System.out.println("a is less than or equal to b");
      }
sc.close();
   }
}
