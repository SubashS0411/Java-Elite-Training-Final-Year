public class Palindrome {
    public static void main(String[] args) {
        String G="malayalam".toLowerCase();
        String GO=new StringBuilder(G).reverse().toString();
        System.out.println(G.equals(GO)?"palindrome":"no palindrome");
    }
}
