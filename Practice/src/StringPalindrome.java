public class StringPalindrome {
    public static void main(String[] args) {
        String str1 = "Was it a car or a cat I saw?";
        System.out.println(palindrome(str1));
    }
    public static String palindrome(String s){
        String lowerCase = s.toLowerCase().replace("?","").replace(" ","");
        return new StringBuilder(s).reverse().toString();
    }
    }

