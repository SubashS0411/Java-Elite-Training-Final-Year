public class ReverseOnlyVowels {
    public static void main(String[] args) {
        String s="hello world";
        System.out.println(vowels(s));
    }
    public static String vowels(String s){
        char[] ch=s.toCharArray();
        int left=0;
        int right= ch.length-1;
        while(left<right) {
            while (left<right && !isVowel(ch[left])) left++;
            while (left<right && !isVowel(ch[right])) right--;
            if(left<right){
                char temp=ch[left];
                ch[left]=ch[right];
                ch[right]=temp;
                left++;
                right--;
            }

        }

        return new String(ch);
    }
    public static boolean isVowel(char ch){
        return (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U');
    }
}
