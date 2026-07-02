public class WithVariable {
    public static void main(String[] args) {
        int a=38;
        int b=100;
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
}
