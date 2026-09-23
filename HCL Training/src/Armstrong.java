public class Armstrong {
    public static void main(String[] args) {
        int n=153,original=n,sum=0;
        int dcount=String.valueOf(n).length();
        while(n>0){
            int digit=n%10;
            sum+=Math.pow(digit,dcount);
            n/=10;
        }
        System.out.println((original==sum)?original+" Is an Armstrong Number":original+" is not Armstrong Number");
    }
}
