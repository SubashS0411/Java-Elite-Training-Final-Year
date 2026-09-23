public class SpyNumber {
    public static void main(String[] args) {
        int n=1124;
        int original=n;
        int sum=0,product=1;
        while(n>0){
            int num=n%10;
            sum+=num;
            product*=num;
            n/=10;
        }
        System.out.println((sum==product)?original+" is a spy number":original+" is not a spy number");
        for (int i = 1; i <=5;) {
            i++;i++;
            System.out.println(i);
        }
    }
}
