class student{
    String name;
    int id;
    int age;
    int grade;
   boolean isPassed(student ob){
if(ob.grade>=40)
return true;
else 
return false;
   }
class Udergrade{
void display(){
    System.out.println("passed");
}
}
class grad{
void display(){
    System.out.println("Fail");
}
}
void display(student ob){
if(ob.isPassed(ob)==true){
Udergrade ob1=new Udergrade();
ob1.display();
}
else{
grad ob2=new grad();
ob2.display();
}
}

}
public class think {
    public static void main(String[] args) {
        student ob=new student();
        ob.grade=41;
        ob.display(ob);
    }
    
}
