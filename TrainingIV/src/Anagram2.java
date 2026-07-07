public class Anagram2 {
    public static void main(String[] args) {
        String g="anagram";
        String a="nagaram";
        System.out.println(isAnagram(g,a));
        System.out.println(isAnagram("rat","car"));
    }
    public static boolean isAnagram(String a,String b){
        if(a.length()!=b.length()){
            return false;
        }
        int[] charcounts=new int[26];
        for(int i=0;i<a.length();i++){
            charcounts[a.charAt(i)-'a']++;
            charcounts[b.charAt(i)-'a']--;
        }
        for(int c:charcounts){
            if(c!=0){
                return false;
            }
        }
        return true;
    }
}
