public class HierachyInheritance {
    public static void main(String[] args) {
        Asus A=new Asus();
        A.VivoBook();
        A.top();
        Lenovo L=new Lenovo();
        L.Loq();
        L.top();
    }
}
class Laptop{
    public void top(){
        System.out.println("This is laptop");
    }
}
class Asus extends Laptop{
    public void VivoBook(){
        System.out.println("Performance Laptop");
    }
}
class Lenovo extends Laptop{
    public void Loq(){
        System.out.println("Best in segment");
    }
}
