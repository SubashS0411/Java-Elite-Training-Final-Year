public class FactorialRecursion {
    public static void main(String[] args) {
        System.out.println(Fact(5));
    }
    public static int Fact(int num){
        if(num==0||num==1) return 1;
        return num*Fact(num-1);
    }
}
