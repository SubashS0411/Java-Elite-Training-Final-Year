public class SuperInherit {
    public static void main(String[] args) {
        Child c=new Child();
        c.Property();
    }
}
class Parent{
    public void Property(){
        System.out.println("This is parent Class");
    }
}
class  Child extends Parent{
    public void Property(){
        super.Property();
        System.out.println("This is child Class" );

    }
}
