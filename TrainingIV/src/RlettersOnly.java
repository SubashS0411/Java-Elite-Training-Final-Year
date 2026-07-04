public class RlettersOnly {
    public static void main(String[] args) {
        String s="a-bC-dEf-ghIj";
        System.out.println(reverseOnlyLetters(s));
    }
    public static String reverseOnlyLetters(String s){
        char[] arr=s.toCharArray();
        int start = 0,end=s.length()-1;
        while(start<end){
          if(!Character.isLetter(arr[start])){
              start++;
            }
         else if(!Character.isLetter(arr[end])){
             end--;
          }
         else{
             char temp=arr[start];
             arr[start]=arr[end];
             arr[end]=temp;
             start++;
             end--;
          }
        }
        return new String(arr);
    }
}
