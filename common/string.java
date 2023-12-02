
public class string{
    public static void main(String[] args){
        
       String name="Venkatesh K";
    //    System.out.println(name);
    //    System.out.println(name.toUpperCase());
    //    System.out.println(name.toLowerCase());
    //    System.out.println(name.substring(2));
    //    System.out.println(name.substring(2,4));
    //    System.out.println(name.charAt(5));
    //    System.out.println(name.indexOf('e',4));
       System.out.println(name.trim());
       System.out.println(name.startsWith("Ve"));
       System.out.println(name.equals("venkatesh k"));
       System.out.println(name.equalsIgnoreCase("VEnkatesh k"));
       System.out.println(name.replace(" ","_"));
       System.out.println(name.length());
       System.err.println(name.endsWith(" K"));
       System.out.println(name.lastIndexOf("e"));



    }
}