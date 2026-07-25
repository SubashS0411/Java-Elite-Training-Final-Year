public class ReplaceConsecutiveDuplicates {
    public static void main(String[] args) {
        String s="aaabbcc";
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if((i<s.length()-1)&& (s.charAt(i)==s.charAt(i+1))){

            }
            else{
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb);
//        Alternative method without using Stringbuilder
//        for (int i = 0; i < s.length(); i++) {
//            if((i<s.length()-1)&& (s.charAt(i)==s.charAt(i+1))){
//
//            }
//            else{
//                System.out.print(s.charAt(i));
//            }
//        }

    }
}
