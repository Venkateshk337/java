public class Inverted_Half_Pyramid {

    public static void main(String[] arg) {
        
        for(int i=4;i>=1;i=i-1){
            for(int j=0;j<=i;j++){
                if(i<=j)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
