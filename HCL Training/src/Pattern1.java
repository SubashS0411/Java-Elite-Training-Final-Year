public class Pattern1 {
    public static void main(String[] args) {
        pat1(3);
    }
    public static void pat1(int n){
        for (int i = n; i >=1 ; i--) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=2*i-1 ; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
