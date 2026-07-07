public class InheritanceExample {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.sound();
        System.out.println(d.age);

    }
}
class Animal{
    int age=25;
    public void sound(){
        System.out.println("This sound is from Animal");
    }
}
class Dog extends Animal{

}
