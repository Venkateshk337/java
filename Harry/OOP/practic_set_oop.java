package OOP;

class employee{
    int salary;
    int getsalary(){
        return salary;
    }
    String name;
    String getname(){
        return name;

    }
    void setname(String name1){
        name=name1;

    }
}

public class practic_set_oop {
    public static void main(String[] args) {
        employee arun=new employee();
    arun.salary=5000;
    arun.name="Arun";
    int salary=arun.getsalary();
    System.out.println(salary);
    String name=arun.getname();
    System.out.println(name);
   arun.setname("Venkatesh");
   System.out.println(arun.getname());


    }
}