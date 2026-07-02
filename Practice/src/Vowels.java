public class Vowels {
    public static void main(String[] args) {
        String words="hello world".toLowerCase();
        int vowels=0,consonants=0;
        for (char ch : words.toCharArray()) {
            if(ch>='a'&&ch<='z'){
                if("aeiou".indexOf(ch)==-1){
                    consonants++;
                }
                else{
                    vowels++;
                }
            }
        }
        System.out.println("vowels: "+vowels);
        System.out.println("consonants: "+consonants);
//        output
//        vowels: 3
//        consonants: 7
    }
}
