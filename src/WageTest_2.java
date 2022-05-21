abstract class Person2 implements PersonPay{
    protected String name;
    public Person2(String name){
        this.name=name;
    }
    public String toString(){
        return "姓名"+this.name+"\t工资支出"+this.pay()+"\n";
    }
}
class Teacher2 extends Person2{
    private double price;
    private double baseWage;
    private int teachingHours;
    public Teacher2(String name,double price,double baseWage,int teachingHours){
        super(name);
        this.price=price;
        this.baseWage=baseWage;
        this.teachingHours=teachingHours;
    }
    public double pay(){
        return baseWage+price*teachingHours;
    }
}

class CollegeStudent2 extends Person2{
    private double scholarship;
    public CollegeStudent2(String name,double scholarship){
        super(name);
        this.scholarship=scholarship;
    }
    public double pay(){
        return scholarship;
    }
}
public class WageTest_2 {
    public static void main(String args[]){
        PersonPay ps[]=new PersonPay[2];
        ps[0]=new Teacher2("张三",2,1000,49);
        ps[1]=new CollegeStudent2("李四",500);
        for(int i=0;i< ps.length;i++){
            System.out.println(ps[i]);
        }
    }
}
