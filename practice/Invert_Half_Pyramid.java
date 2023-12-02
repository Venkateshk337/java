public class Invert_Half_Pyramid {

    public static void main(String[] arg) {
        
        for(int i=4;i>=1;i=i-1){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
