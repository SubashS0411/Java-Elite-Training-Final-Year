public class Star {
    public static void main(String[] args) {
//        starpatter1(5);
//        starpatter2(5);
//        starpatter3(5);
//        starpatter4(5);
        starPattern5(6);
    }



    public static void starpatter1(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    public static void starpatter2(int n){
        for (int i = 0; i <=n ; i++) {
            for (int j = 0; j<n-i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void starpatter3(int n){
        for (int i = n; i >=1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void starpatter4(int n) {
//        JavvuMitai
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
        public static void starPattern5(int n){
            for (int i = n; i >=0 ; i++) {
                for (int j = 0; j < n-i; j++) {
                    System.out.print(" ");
                }
                for (int j = n; j >0 ; j--) {
                    System.out.print("*");
                }
                System.out.println();
            }
    }
}
