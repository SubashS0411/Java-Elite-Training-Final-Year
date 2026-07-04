public class LargestOdd {
    public static void main(String[] args) {
        String num="52";
        System.out.println(largestOddNumber(num));
    }
    public static String largestOddNumber(String num){
       for(int i=num.length()-1;i>=0;i--){
           char ch=num.charAt(i);
           if(((int)(ch &1)!=0)){
               return num.substring(0,i+1);
           }
       }
       return "";
    }
}
