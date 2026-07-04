public class ReverseAWords {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(reverseWords(s));
        System.out.println(reverseWords("the sky is blue"));
        System.out.println(reverseWords(" a good   example "));
    }
    public static String reverseWords(String s){
        if(s==null||s.trim().isEmpty()){
            return "";
        }
        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i= words.length-1;i>=0;i--){
            sb.append(words[i]).append(" ");
            if(i>0) {
                sb.append(" ");
            }
//            if(i==words.length-1){
//                sb.append(' ');
//            }
        }
        return sb.toString();
    }
}
