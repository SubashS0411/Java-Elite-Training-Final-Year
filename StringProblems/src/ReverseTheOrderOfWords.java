import java.util.Arrays;

public class ReverseTheOrderOfWords {
    public static void main(String[] args) {
        String words="I like Java";
        String[] wordArr=words.split("\\s+");
//        System.out.println(Arrays.toString(wordArr));
//        for (int i = wordArr.length-1; i >=0 ; i--) {
//            System.out.print(wordArr[i]+" ");
//        }
        StringBuilder reversed=new StringBuilder();
        for (int i = wordArr.length-1; i >=0 ; i--) {
            reversed.append(wordArr[i]);
            if(i>0){
                reversed.append(" ");
            }
        }
        System.out.println(reversed);
    }
}
