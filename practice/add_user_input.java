import java.util.*;
public class add_user_input {
    public static void main(String[] arg){
        System.out.println("Enter two numbers");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        System.out.print("sum="+sum);
      
        sc.close();
    }
}
