public class Builder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Hello");
        System.out.println(sb.append(" World"));
        sb.insert(0,"Hello");
        String str="malayalam";
        System.out.println(Pali(str));
        System.out.println(pali2(str));
        System.out.println(pali3(str));
    }
    public static boolean Pali(String str){
        String sb=new StringBuilder(str).reverse().toString();
        return str.equals(sb);
    }
    public static boolean pali2(String str){
        String s="";
        for(int i=str.length()-1;i>=0;i--)
            s +=(str.charAt(i));
        return str.equals(s);
    }
    public static boolean pali3(String str){
        int start=0;
        int end=str.length()-1;
        while(start<end){
            if(str.charAt(start++)!=str.charAt(end--)){
                return false;
            }

        }
        return true;
    }
}
