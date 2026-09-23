public class StrongNumber {
    public static void main(String[] args) {
        int n=145,original=n,sum=0;
        while(n>0){
            int num=n%10;
            sum+=fact(num);
            n/=10;
        }
        System.out.println((sum==original)?original+" is a Strong number":original+" is not a Strong number");

    }
    public static int fact(int n){
        if(n==0||n==1) return 1;
        return n*fact(n-1);
    }
}
