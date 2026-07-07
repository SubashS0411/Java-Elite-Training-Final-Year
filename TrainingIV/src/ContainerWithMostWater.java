public class ContainerWithMostWater {
    public static void main(String[] args) {
//        int [] water={1,8,6,2,5,4,8,3,7};
//        System.out.println(maxArea(water));
    }
    public static int maxArea(int[] height){
        int min=0;
        int max=height.length-1;
        int maxwater=0;
      while(min<max){
          int currentwater=(max-min)*Math.min(height[min],height[max]);
          maxwater=Math.max(maxwater,currentwater);
          if(height[min]<height[max]){
              min++;
          }
          else {max--;}
      }
        return maxwater;
    }
}
