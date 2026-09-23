public class HarshadNumber {
    public static void main(String[] args) {
        int num=18,original=num,sum=0;
        while(num!=0){
            int n=num%10;
            sum+=n;
            num/=10;
        }
        System.out.println((original%sum==0)?original+" is a Harshad number":original+" is not a Harshad number");
    }
}
