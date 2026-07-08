public class SmartPhoneEgInterface {
    public static void main(String[] args) {
        Smartphone s=new Smartphone();
        s.Location();
        s.takePhoto();
    }
}
interface Camera{
   void takePhoto();
}
interface GPS{
   void Location();
}
class Smartphone implements Camera,GPS{
    @Override
    public void takePhoto() {
        System.out.println("Taking photo");
    }

    @Override
    public void Location() {
        System.out.println("Location Shared");
    }
}
