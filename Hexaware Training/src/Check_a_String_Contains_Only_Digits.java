public class Check_a_String_Contains_Only_Digits {
    public static void main(String[] args) {
     String str="123456a";
     boolean b=true;
        for (int i = 0; i < str.length(); i++) {
            if(!isdigits(str.charAt(i))){
                b=false;
            }
        }
        System.out.println(b?"YES":"NO");
    }
    public static boolean isdigits(char ch){
        return (ch=='1'||ch=='2'||ch=='3'||ch=='4'||ch=='5'||ch=='6'||ch=='7'||ch=='8'||ch=='9'||ch=='0');
    }
}
