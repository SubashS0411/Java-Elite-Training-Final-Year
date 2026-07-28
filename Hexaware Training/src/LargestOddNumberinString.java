public class LargestOddNumberinString {
    public static void main(String[] args) {
        String str="52";
//        System.out.println(largestOddNumber(str));
//        System.out.println(largestOddNumber("4206"));
//        System.out.println(largestOddNumber("35427"));
        System.out.println(large2(str));
        System.out.println(large2("35427"));
        System.out.println(large2("52"));
    }
    public static String large2(String str){
        for (int i = str.length()-1; i >=0 ; i--) {
            int digit=str.charAt(i)-'0';
            if(digit%2==1){
                System.out.print(str.substring(0,i+1));
                break;
            }
        }
        return " ";
    }
    public static String largestOddNumber(String str){
        for (int i = str.length()-1; i >=0 ; i--) {
            char ch=str.charAt(i);
            if(ch%2!=0){
                return str.substring(0,i+1);
            }
        }
        return "";
    }
}
