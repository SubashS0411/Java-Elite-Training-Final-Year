public class Substring_Without_Repeating_Characters {
    public static void main(String[] args) {
        String s="abcabcbb";
        int high=0;
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            if((i<s.length()-1) && (s.charAt(i)-'a')-(s.charAt(i+1)-'a')!=1){
                count=0;
            }
            else {
                count++;
                if (count > high) {
                    high = count;
                }
            }
        }
        System.out.println(high);
    }

}
