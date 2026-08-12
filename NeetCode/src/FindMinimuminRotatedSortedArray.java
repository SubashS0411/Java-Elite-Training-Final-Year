public class FindMinimuminRotatedSortedArray {
    public static void main(String[] args) {
        System.out.println(findMin(new int[]{3,4,5,6,1,2}));
        System.out.println(findMin(new int[]{4,5,0,1,2,3}));
    }
    public static int findMin(int[] arr){
        if(arr==null||arr.length==0){
            return 0;
        }
        int low=0,high= arr.length-1;
        int ans= Integer.MAX_VALUE;
        while (low<=high){
            int mid=low+(high-low)/2;
            if(arr[low]<=arr[mid]){
                ans=Math.min(ans,arr[low]);
                low=mid+1;
            }
            else {
                high=mid-1;
                ans=Math.min(ans,arr[mid]);
            }
        }
        return ans;
    }
}
