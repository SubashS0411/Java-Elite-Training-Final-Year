public class ReverseString {
    public static void main(String[] args) {
        String G="malayalam";
        String o="";
        for(int i=G.length()-1;i>=0;i--){
            o+=G.charAt(i);
        }
        System.out.println(o);
    }
}
