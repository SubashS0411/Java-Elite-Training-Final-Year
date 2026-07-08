public class Armstrong {
    public static void main(String[] args) {
        int n = 19;
        int original = n;
        int len = String.valueOf(n).length();
//        int len=Integer.toString(n).length();
        int sum = 0;
        while (n > 0) {
            int temp = n % 10;
            sum += Math.pow(temp, len);
            n /= 10;
        }
        System.out.println(original == sum ? "This is armstrong number" : "This is not a armstrong number");
    }

    public static boolean isArmstrong(int n) {
        int original = n;
        int len = String.valueOf(n).length();
        int sum = 0;
        while (n > 0) {
            int temp = n % 10;
            sum += Math.pow(temp, len);
            n /= 10;
        }
         return original == sum;
    }
}
