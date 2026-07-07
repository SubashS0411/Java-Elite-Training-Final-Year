public class ReverseNumber {
    public static void main(String[] args) {
        int a=12234;
        int reversed=0;
        while(a!=0){
            int d=a%10;
             reversed=reversed*10+d;
            a/=10;
        }
        System.out.println(reversed);
    }
}
