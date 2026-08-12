public class ConvertBinaryToValue {
    public static void main(String[] args) {
        String n = "1011";
        int number = 0;
        int pow = 0;
        for (int i = n.length() - 1; i >= 0; i--) {
            if (n.charAt(i) == '1') {
                number += Math.pow(2, pow);
            }
            pow++;
        }
        System.out.println(number);
        System.out.println(Integer.parseInt(n, 2));
        System.out.println(ConvertBi(Integer.parseInt(n)));
        System.out.println(ConvertBi1(Integer.parseInt(n)));
    }
    public static int ConvertBi(int n){
        int num=0;
        int pow=0;
        while (n>0){
//            int digit=n%10;
            num+=(n%10)*Math.pow(2,pow);
            n/=10;
            pow++;
        }
        return num;
    }
    public static int ConvertBi1(int n){
        int num=0;
        int pow=0;
        while (n!=0){
            num+=(n%10)*(1<<pow);
            pow++;
            n/=10;
        }
        return num;
    }
}
