public class PairSum {
    public static void main(String[] args) {
        int[]arr={2,4,6,8,10};
        pairSum(arr,12);
        System.out.println("Next arrr");
        pairSum(new int[]{1,3,5,7,9},10);
    }
    public static void pairSum(int[] arr,int target){
        int left=0;
        int right=arr.length-1;
        while (left<right) {
            if (arr[left] + arr[right] == target) {
                System.out.println(arr[left] + " " + arr[right]);
                right--;
                left++;
            } else if (arr[left] + arr[right] < target) {
                left++;
            } else {
                right--;
            }
        }
    }
}
