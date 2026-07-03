import java.util.Scanner;
import static java.lang.System.*;
public class StringPractice {
    public static void main(String[] args) {
//         String str = " abcde";
//        String s2=new String("Hello");
//        out.println(s2);
//        out.println(str.equals(s2));
//        String str1 = "Great fox";
//        out.println(str1.concat(str));
//        //  \u000d out.println("Done");
/*
        Scanner sc=new Scanner(System.in);
        out.println("Enter the first String: ");
        String str=sc.nextLine().trim().toLowerCase();
        out.println(str);
*/
////        sc.nextLine();
//        out.println("Enter the second String: ");
//        String str1= str1= sc.nextLine().trim().toLowerCase();
//        String sb=new StringBuilder(str1).reverse().toString();
//        out.println(str1);
//        out.println(str1.equals(str)?"Entered Strings are equal":"Entered Strings are not equal");
        String str="java";
//        Methods(str);
        Method2(str);
    }

    public static void Method2(String str) {
        char[] arr=str.toCharArray();
        for(char c:arr){
            out.print(c+" ");
        }
        out.println();
        for(int i=1;i<=str.length();i++){
            out.print(str.charAt(str.length()-i)+" ");
        }
        out.println();
        out.println(new StringBuilder(str).reverse().toString());
    }

    public static void Methods(String str){
        out.println(str.length());
        out.println(str.charAt(2));
        out.println(str.charAt(str.length()-1));
        out.println(str.toUpperCase().charAt(0)+str.toLowerCase().substring(1,str.length()));
        out.println(str.substring(0,1).toUpperCase()+str.substring(1).toLowerCase());
        out.println(str.contains("a")?"String contains a":"String does not contain a");
        out.println(str.replace("j","b"));
        out.println(str.replaceAll("^[a-z]","b"));
        String s="  welcome to Hyderabad  ";
        out.println(s.trim());
    }
}
