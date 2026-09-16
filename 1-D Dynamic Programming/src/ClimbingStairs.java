public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbstairs(3));
    }
    public static int climbstairs(int n){
            int one=1,two=1;
            for (int i = 0; i < n-1; i++) {
                int temp=one;
                one=one+two;
                two=temp;
            }
            return one;
        }
}
