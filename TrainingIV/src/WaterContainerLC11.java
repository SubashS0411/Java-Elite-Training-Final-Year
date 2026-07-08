public class WaterContainerLC11 {

    public static void main(String[] args) {
        int[] water = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(water));
    }
    public static int maxArea(int[] height){
        int l=0,r= height.length-1;
        int max=Integer.MIN_VALUE;
        while (l<r){
            int h=Math.min(height[l],height[r]);
            int area=h*(r-l);
            max=Math.max(area,max);
            if(height[l]<height[r])l++;
            else r--;
        }
        return max;
}
}
