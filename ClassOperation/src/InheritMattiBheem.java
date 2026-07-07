public class InheritMattiBheem {
    public static void main(String[] args) {
        Bheem b=new Bheem();
        b.Display("bheem",90,"Nothing");
        TunTun t=new TunTun();
        t.Display("TunTunHusbandGopi",20,"PowerOfGopi");
        Chuki c=new Chuki();
        c.Display("Chuki",69,"EnjoyWithBheem");
        Saavi3 s=new Saavi3();
        s.Display("Saavi",25,"ManaiviOfGopi");
        DadlittlePrinces d=new DadlittlePrinces();
        d.Display("Meenu",7,"GopiSchoolMate");
    }
}
 class Character{
    int age;
    String name;
    String power;
}
class Bheem extends  Character{
    public void Display(String name,int age,String power){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Power: "+power);
    }
}
class TunTun extends  Character{
    public void Display(String name,int age,String power){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Power: "+power);
    }
}
class Chuki extends  Character{
    public void Display(String name,int age,String power){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Power: "+power);
    }
}
class Saavi3 extends  Character{
    public void Display(String name,int age,String power){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Power: "+power);
    }
}
class DadlittlePrinces extends  Character{
    public void Display(String name,int age,String power){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Power: "+power);
    }
}
