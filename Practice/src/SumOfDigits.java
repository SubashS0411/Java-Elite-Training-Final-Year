public class SumOfDigits {
    public static void main(String[] args) {
        int digits=12345;
        int sum=0;
        while(digits>0){
            sum+=digits%10;
            digits=digits/10;
        }
        System.out.println(sum);
//        output: 15
    }
}
