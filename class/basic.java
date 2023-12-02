import java.util.*;

public class basic {
    public static void main(String[] arg){
        System.out.println("enter the two boolen value");
        Scanner sc=new Scanner(System.in);
        boolean a=sc.nextBoolean();
        boolean b=sc.nextBoolean();
        System.out.println();
        System.out.print("And Operation:");
        if(a && b){
            System.out.println("True");
        }
        else{
            System.out.println("False");}
        System.out.print ("OR Operation:");
        if(a || b){
            System.out.println("True");
        }
        else{
            System.out.println("False");}
        System.out.print("NOt Operation:");
        
            System.out.println(!a);
        sc.close();
}
}