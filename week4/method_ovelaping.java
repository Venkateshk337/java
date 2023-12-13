public class method_ovelaping{
    public static void add(int a,int b){
        System.out.println("add int="+a+b);
    }
    public static void add(double a,double b){
        System.out.println("add double="+a+b);
    }
    public static void add(String a,String b){
        System.out.println("add String="+a+b);
    }
    public static void main(String[] args){
add(10,20);
add(10.0,20.0);
add("Venkatesh","K");
    }
}