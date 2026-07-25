public class StringPalindrome {
    public static void main(String[] args) {
        String str="madam";
        System.out.println(isPalindrome(str)? "YES":"NO");
    }
    public static boolean isPalindrome(String str){
        int left=0;
        int right=str.length()-1;
//        str=str.toLowerCase();
        while(left<right){
            char leftchar=str.charAt(left);
            char rightchar=str.charAt(right);

            if(leftchar!=rightchar) return false;
            left++;
            right--;
        }
        return true;
    }
}
