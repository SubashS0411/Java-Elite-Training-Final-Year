public class ConstructorPractice {
    public static void main(String[] args) {
        Constru c=new Constru(101,"Loq");
        Constru c1=new Constru(102,"Evofox","crDroid");
    }
}
//Constructor( two paramater)-Name,id
//Name,id,dept
class Constru{
    int id;
    String name;
    String dept;
    public Constru(int id,String name) {
        this.name=name;
        this.id=id;
        System.out.println("Name: "+name+" Id: "+id);
    }
    public Constru(int id,String name,String dept) {
        this.name=name;
        this.id=id;
        this.dept=dept;
        System.out.println("Name: "+name+" Id: "+id+" Dept: "+dept);
    }

}
