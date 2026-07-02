public class SingleNumber {
    public static void main(String[] args) {
        int[] arr={4,1,2,1,2};
        System.out.println(singleNumber(arr));
    }
    public static int singleNumber(int[] arr){
        int ans=0;
        for(int i:arr){
            ans=ans^i;
        }
        return ans;
    }
}
