import java.util.ArrayList;

public class Subsequence {
    public static void main(String[] args) {
//        subseq("","ABC");
//        System.out.println();
//        System.out.println(subseqarray("","abc"));
//        System.out.println();
        Ascii("","abc");
        System.out.println();
        System.out.println(subseqarrayAscii("","abc"));
    }
    public static void subseq(String p,String up){
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        char ch=up.charAt(0);
        subseq(p+ch,up.substring(1));
        subseq(p,up.substring(1));
    }
    public static ArrayList<String> subseqarray(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
       ArrayList<String>left=subseqarray(p+ch,up.substring(1));
        ArrayList<String>right= subseqarray(p,up.substring(1));
        left.addAll(right);
        return left;
    }
    public static void Ascii(String p,String up){
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        char ch=up.charAt(0);
        Ascii(p+ch,up.substring(1));
        Ascii(p,up.substring(1));
        Ascii(p+(ch+0),up.substring(1));
    }
    public static ArrayList<String> subseqarrayAscii(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String>left=subseqarrayAscii(p+ch,up.substring(1));
        ArrayList<String>right= subseqarrayAscii(p,up.substring(1));
        ArrayList<String>ascii=subseqarrayAscii(p+(ch+0),up.substring(1));
        left.addAll(right);
        left.addAll(ascii);
        return left;
    }
}
