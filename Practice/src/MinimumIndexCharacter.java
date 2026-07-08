public class MinimumIndexCharacter {
//    This solution is just try not fully working

    public static void main(String[] args) {
        String s1="adcffaet";
        String s2="onkl";
        char[] s1a=s1.toCharArray();
        char[] s2a=s2.toCharArray();
        int val=-1;
        for(int i=0;i< s2a.length;i++){
            if(s1a[i]==s2a[i]){
                val=i;
                break;
            }
        }
        System.out.println(val);
    }
}
