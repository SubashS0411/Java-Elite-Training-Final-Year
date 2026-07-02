public class Prime {
    public static void main(String[] args) {
        int n=43;
        boolean isprime=true;
        for (int i = 2; i <Math.sqrt(n) ; i++) {
            if(n%i==0){
                isprime=false;
                break;
            }
        }
        System.out.println(n+" is prime"+(n>1 && isprime));
    }
}
