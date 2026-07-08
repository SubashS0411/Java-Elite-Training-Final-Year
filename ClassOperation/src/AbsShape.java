public class AbsShape {
    public static void main(String[] args) {
        Square s=new Square();
        s.CalculateArea(8,8);
        Rectangle r=new Rectangle();
        r.CalculateArea(8,9);
        Triangle t=new Triangle();
        t.CalculateArea(5,7);
    }
}
abstract class Shape{
    abstract void CalculateArea(int a,int b);
    public void display(String Shape,double area){
        System.out.println("Area of "+Shape+" is: "+area);
    }
}
class Square extends Shape{
    void CalculateArea(int a,int b){
//        System.out.println("Area of Square: "+(a*b));
        display("Square",a*b);

    }
}
class Rectangle extends Shape{
    void CalculateArea(int a,int b){
//        System.out.println("Area of Rectangle: "+(a*b));
        display("Rectangle",a*b);

    }
}
class Triangle extends Shape{
    void CalculateArea(int a,int b){
//        System.out.println("Area of Triangle: "+(0.5*a*b));
        display("Triangle",(0.5)*a*b);

    }
}