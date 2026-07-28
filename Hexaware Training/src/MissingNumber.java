public class MissingNumber {
    public static void main(String[] args) {
        int[] arr={3,0,1};
        System.out.println(missingNumber(arr));
        System.out.println(missingNumber(new int[]{0,1}));
    }
    public static int missingNumber(int[] arr){
        int len= arr.length;
        int sum= (len*len+1)/2;
        for(int num:arr){
            sum=sum-num;
        }
        return sum;
    }
}
