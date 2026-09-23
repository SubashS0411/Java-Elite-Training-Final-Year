public class Pattern1 {
    public static void main(String[] args) {
//        pat1(3);
//        pat2(5);
        patalpha(4);
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
    public static void pat2(int n){
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("G");
            }
            for (int j = 1; j <=2*(n-i); j++) {
                System.out.print(" ");
            }
            for (int j =1; j <=i; j++) {
                System.out.print("O");
            }

            System.out.println();
        }
        for (int i = n; i>=0; i--) {
            for (int j = 0; j <i; j++) {
                System.out.print("P");
            }
            for (int j = 0; j <2*(n-i) ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <i ; j++) {
                System.out.print("I");
            }
            System.out.println();
        }
    }
    public static void patalpha(int num){
        for (int i = 0; i <=num; i++) {
            for(int j=0;j<i;j++){
                System.out.print((char)('A'+j)+" ");
            }
            System.out.println();
        }
    }
}
