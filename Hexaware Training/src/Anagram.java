import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
//
        Scanner s=new Scanner(System.in);
        String a=s.next();
        String b=s.next();
        if(isAnagram(a,b)) System.out.println("Anagram");
        else System.out.println("Not Anagram");
    }
    public static boolean isAnagram(String a,String b){
        if(a.length()!=b.length()) return false;
        a=a.toLowerCase();
        b=b.toLowerCase();
        int[] arr=new int[26];
        for (int i = 0; i <a.length(); i++) {
            arr[a.charAt(i)-'a']++;
            arr[b.charAt(i)-'a']--;

        }
        for(int c:arr){
            if(c!=0) return false;
        }

        return true;
    }
}
