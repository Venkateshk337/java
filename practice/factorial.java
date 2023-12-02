import java.util.*;
public class factorial {
    public static void factorialTwoNO(int a){
        int fact=1;
        if(a<0)
        System.out.println("invalide input");
        else if(a==0)
        System.out.println("Factorial is: 1");
        else{
            for(int i=1;i<=a;i++){
                fact=fact*i;

            }
            System.out.println("Factorial is:"+fact);
        }
    }
    public static void main(String[] arg){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
factorialTwoNO(a);
sc.close();
    }
    
}
