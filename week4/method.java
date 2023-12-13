class method{
    public static void rect(int l,int b){
        System.out.println("Area of rectangle="+l*b);
    }
    public static void rect(double l,double b){
        System.out.println("Area of rectangle="+l*b);
    }
    public static void main(String args[]){
        rect(10,20);
        rect(10.0,20.0);
        rect(10.0,20);
        rect(10,20.0);
    }
}