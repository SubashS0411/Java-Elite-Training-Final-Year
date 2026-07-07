import java.util.Scanner;

public class ReverseStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the String : ");
        String str = sc.nextLine();
        System.out.println(reverse(str));
    }
    public static String reverse(String str){
        StringBuilder sb = new StringBuilder(str);
        String rev=sb.reverse().toString();
        return rev;
    }
}
