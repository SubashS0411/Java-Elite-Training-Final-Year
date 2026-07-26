public class Reverse_Words_Sentence {
    public static void main(String[] args) {
        String str="the sky is blue";
        String[] s1=str.split("\\s+");
        int left=0;
        int right=s1.length-1;
        while(left<right){
            String temp=s1[left];
            s1[left]=s1[right];
            s1[right]=temp;
            left++;
            right--;
        }
        for (String sb:s1){
            System.out.print(sb+" ");
        }
    }
}
