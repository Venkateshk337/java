import java.util.Scanner;

public class string_lower {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println(name.toLowerCase());
        System.out.println(name.replace(" ","_"));

        // problem3
        String letter="Dear <|name|>, Thanks lot ";
        letter=letter.replace("<|name|>","Harry");
        System.out.println(letter);

        // Problem 4
        String name1 = "VEnkatesh   k";
        System.out.println(name1.charAt(5));
        System.out.println(name1.indexOf("   "));
        sc.close();
    }
}
