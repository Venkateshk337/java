package OOP;

class emplooy {
    String name;
    int id;
// emplooy(String n,int s){
//      name=n;
//      id=s;

// }
    
}

public class introduction {
    public static void main(String[] args) {
        // DRY --> Donot repeat again
        emplooy venkatesh = new emplooy();
        venkatesh.name = "Venkatesh";
        venkatesh.id = 157;
        // emplooy arun = new emplooy();
        // arun.name = "Arun";
        // arun.id = 167;

        System.out.println(venkatesh.name);
        System.out.println(venkatesh.id);
        // System.out.println(arun.name);
        // System.out.println(arun.id);

    }

}
