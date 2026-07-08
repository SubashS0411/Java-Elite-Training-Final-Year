public class Automobile {
    public static void main(String[] args) {
        SportCar myFerrari=new SportCar();
        System.out.println("Speed: "+myFerrari.speed);
        myFerrari.startEngine();

        // Level 2: Inherited from Parent (Car)
        System.out.println("Doors: " + myFerrari.doors);
        myFerrari.door();

        // Level 3: Local to Grandchild (SportsCar)
        System.out.println("Has Turbo: " + myFerrari.hasTurbo);
        myFerrari.activeTurbo();
    }
}
//Multilevel Inherientance
class Vehicle{
    int speed=40;
    public void startEngine(){
        System.out.println("Engine is started");
    }
}
class Car extends Vehicle{
    int doors=4;
    public void door(){
        System.out.println("Car has 4 doors");
    }
}
class SportCar extends Car{
    boolean hasTurbo=true;
    public void activeTurbo(){
        System.out.println("SportsCar: Turbo activated");
    }
}