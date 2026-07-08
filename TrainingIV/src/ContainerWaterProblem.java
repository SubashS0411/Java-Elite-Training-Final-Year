public class ContainerWaterProblem {
    public static void main(String[] args) {
        int[] water={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(water));
    }
    public static int maxArea(int [] arr){
        int left=0,right=arr.length-1;
        int max=Integer.MIN_VALUE;
        while(left<right){
            int height=Math.min(arr[left],arr[right]);
            int area=height*(right-left);
            max=Math.max(area,max);
//            Optimized approach is in down
            if(arr[left]<arr[right])left++;
            else right--;
//            while(left<right && arr[left]<=height){
//                left++;
//            }
//            while(left<right && arr[right]<=height){
//                right--;
//            }

        }
        return max;
    }
}
