public class ContainerWithMostWater {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,7,2,5,4,7,3,6}));
        System.out.println(maxArea(new int[]{2,2,2}));
    }
    public static int maxArea(int[] arr){
        int left=0,right=arr.length-1;
        int max=Integer.MIN_VALUE;
        while(left<right){
            int height=Math.min(arr[left],arr[right]);
            int area=height*(right-left);
            max=Math.max(max,area);
            while (left<right && arr[left]<=height) left++;
            while(left<right && arr[right]<=height) right--;
        }
        return max;
    }
}
