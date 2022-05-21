abstract class Person{
    protected String name;
    public Person(String name){
        this.name=name;
    }
    abstract public double pay();
    public String toString(){
        return "姓名:"+this.name+"\t工资支出:"+this.pay()+"\n";
    }
}
class Teacher extends Person{
    private double price;
    private double baseWage;
    private int teachingHours;
    public Teacher(String name,double baseWage,double price,int teachingHours){
        super(name);
        this.baseWage=baseWage;
        this.price=price;
        this.teachingHours=teachingHours;
    }
    public double pay(){
        return baseWage+price*teachingHours;
    }
}
class CollegeStudent extends Person{
    private double scholarship;
    public CollegeStudent(String name,double scholarship){
        super(name);
        this.scholarship=scholarship;
    }
    public double pay(){
        return scholarship;
    }
}

public class WageTest {
    public static void  main(String args[]){
        Person ps[]=new Person[2];
        ps[0]=new Teacher("张三",1000,2,49);
        ps[1]=new CollegeStudent("李四",500);
        for(int i=0;i<ps.length;i++){
            System.out.println(ps[i]);
        }
    }
}
