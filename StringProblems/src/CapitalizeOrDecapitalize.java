public class CapitalizeOrDecapitalize {
    public static void main(String[] args) {
        String str="banana";
        char c='a';

        System.out.println(CapOrDe(str,c));
        System.out.println(CapOrDe(new String("JAvA ProgrAmming"),'a'));
        System.out.println(CapOrDe(new String("Hello World"),'l'));
    }
    public static String CapOrDe(String str,char c){
        char flip=Character.isLowerCase(c)?Character.toUpperCase(c):Character.toLowerCase(c);
        StringBuilder sb=new StringBuilder(str);
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==c){
                sb.setCharAt(i,flip);
            }
        }
        return sb.toString();
    }
}
