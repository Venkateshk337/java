class bank{
//    float getRateofInterset(){
//     System.out.println("Bank Interset");
//    }
}
class SBI extends bank{
    float getRateofInterset(){
        return 8.00f;
    }
}
class ICICI extends bank{
    float getRateofInterset(){
        return 7.00f;
    }
}
class AXIS extends bank{
    float getRateofInterset(){
        return 9.00f;
    }
}
class driver{
    void display(SBI ob,ICICI ob1,AXIS ob2){
        System.out.println("SBI interset is "+ob.getRateofInterset()+"%");
        System.out.println("ICICI interset is "+ob1.getRateofInterset()+"%");
        System.out.println("AXIS interset is "+ob2.getRateofInterset()+"%");
    }
}public class demo{
    public static void main(String args[]){
        driver dr=new driver();
        SBI ob=new SBI();
        ICICI ob1=new ICICI();
        AXIS  ob2=new AXIS();
        dr.display(ob,ob1,ob2);
    }
}