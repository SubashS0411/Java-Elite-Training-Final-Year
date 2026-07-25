public class StringReverse {
    public static void main(String[] args) {
        System.out.println(revString("hello"));
        System.out.println(SbString("hello"));
    }
    public static String revString(String s){
        String rev="";
        for (int i = s.length()-1; i >=0 ; i--) {
            rev+=s.charAt(i);
        }
        return rev;
    }
    public static String SbString(String s){
       StringBuilder sb=new StringBuilder(s);
       return String.valueOf(sb.reverse());

    }
}
