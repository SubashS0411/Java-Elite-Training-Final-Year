public class StringCompression {
    public static void main(String[] args) {
        String str="aaabbc";
        StringBuilder sb=new StringBuilder();
//        sb.append(str.charAt(0));
        int count=1;
        for (int i = 0; i <str.length() ; i++) {

            if(i+1<str.length()&& str.charAt(i)==str.charAt(i+1)){
                count++;
            }
            else{
                sb.append(str.charAt(i)).append(count);
                count=1;
            }
        }
        System.out.println(sb.toString());
    }
}
