public class Welcome {
    public static void main(String[] args) {

        wel("Evofox");
        stuintro("Krish");
        System.out.println(square(5));
        int principal=10000;
        double n=2.5;
        double rate=8;
        System.out.println(SimpleInterest(principal,n,rate));
    }
    public static void wel(String s){
        System.out.println("Welcome: "+s);
    }
    public static void stuintro(String s){
        System.out.println("Hi Everyone this is "+s);
    }
    public static int square(int square){
        return square * square;
    }
    public static double SimpleInterest(int principal,double n,double rate){
        return (principal * n * rate)/100;
    }
}
