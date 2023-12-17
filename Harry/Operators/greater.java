package Operators;
import java.util.Scanner;
public class greater {
    public static void main(String[] args){
        System.out.println("Enter the two number:");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("Number 1 is greater than number 2:"+(num1>num2));


        //expression
        int v=2;
        int u=1;
        int a=3;
        int s=1;
        System.out.println((double)(v*v-u*u)/(2*a*s));
        sc.close();

        // a=7*49/7+35/7
        int x=7;
        a=7*49/7+35/7;
        System.out.println("a="+a);
        System.out.println("x="+x);

    }
}
