import java.util.*;
public class function_sum {
//     public static int sumTwoNo(int a,int b){
//         int sum=a+b;
//         return sum;
//     }
public static int productTwoNo(int a,int b){
    return a*b;
}
    public static void main(String[] arg){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
// int c=sumTwoNo(a,b);
// System.out.println("Sum:"+c);
System.out.print("product:"+productTwoNo(a,b));
sc.close();
    }
}
