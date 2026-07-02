public class MissingNumber {
    public static void main(String[] args) {
        int arr[] ={1,2,3,5,6,7};
        System.out.println(miss(arr));
    }
    public static int miss(int[] arr){
        int n=arr.length+1;
        int exp=n*(n+1)/2;
        int ans=0;
        for(int i:arr){
            ans+=i;
        }
        return exp-ans;
    }
}
