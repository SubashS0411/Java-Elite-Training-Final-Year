public class Skip {
    public static void main(String[] args) {
        String a="aabbcde";
//        skiped("",a);
//        System.out.println(skiped(a));
        System.out.println(skipAppNotApple("kdfjkappjkapplem"));
    }
    public static void skiped(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        if(ch=='b'){
            skiped(p,up.substring(1));
        }
        else{
            skiped(p+ch,up.substring(1));
        }
    }
    public static String skiped(String up){
        if(up.isEmpty()){
            return " ";
        }
        char ch=up.charAt(0);
        if(ch=='b'){
           return skiped(up.substring(1));
        }
        else{
            return ch+ skiped(up.substring(1));
        }
    }
    public static String skipAppNotApple(String up){
        if(up.isEmpty()){

            return " ";
        }
        if(up.startsWith("app") && !up.startsWith("apple")){
            return skipAppNotApple((up.substring(5)));
        }
        else{
            return up.charAt(0)+ skipAppNotApple((up.substring(1)));
        }
    }
}
