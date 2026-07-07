import java.sql.SQLOutput;

public class MultilevelHeritance {
    public static void main(String[] args) {
        Jesus j=new Jesus();
        j.Narimouse();
        j.LOQ();
        j.Intel();
    }
}
class Gp{
    public void LOQ(){
        System.out.println("This is GrandParent");
    }
}
class Father extends Gp{
    public void Intel(){
        System.out.println("This is Father ");
    }
}
class Jesus extends Father{
    public void Narimouse(){
        System.out.println("This is Jesus Class");
    }
}