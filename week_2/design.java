import java.util.Scanner;

public class design{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the no of lines: ");
        int n=scan.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i*i&& j<=i*2;j=j+i){
                System.out.print(j+ " ");
                if(i==0)break;
            }
            System.out.println();
        }
    }
}

