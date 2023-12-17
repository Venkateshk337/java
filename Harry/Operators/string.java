package Operators;

public class string {
    public static void main(String[] args){
        String name="Venkatesh K";
        // covert to lower case
        System.out.println(name.toLowerCase());
        // replace space by "_"
        System.out.println(name.replace(" ","_"));
        // Replace "<|name1|>" by name
        String letter="Dear <|name1>| ,Thanks a lot ";
        letter=letter.replace("<|name1>|","Venkatesh");
        System.out.println(letter);
        // finding double Space and triple places in string
        System.out.println(name.indexOf("   "));
        // Formate the letter by escape sequence
        letter ="Dear Harry,\n\tThis Java Course is nice.\n\tThanks";
        System.out.println(letter);

    }
    
}
