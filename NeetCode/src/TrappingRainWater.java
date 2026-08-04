public class TrappingRainWater {
    public static void main(String[] args) {
//        System.out.println(trap(new int[]{0,2,0,3,1,0,1,3,2,1}));
//        System.out.println(trap1(new int[]{0,2,0,3,1,0,1,3,2,1}));
        System.out.println(trap3(new int[]{0,2,0,3,1,0,1,3,2,1}));

    }
//    82ms
    public static int trap(int[] arr){
        if(arr.length==0){
            return 0;
        }
        int res=0;
        int n= arr.length;
        for (int i = 0; i < n; i++) {
            int leftmax=arr[i];
            int rightmax=arr[i];
            for (int j = 0; j < i; j++) {
                leftmax=Math.max(leftmax,arr[j]);
            }
            for (int j = i+1; j <n ; j++) {
                rightmax=Math.max(rightmax,arr[j]);
            }
            res+=Math.min(leftmax,rightmax)-(arr[i]);
        }
        return res;
    }
//    75ms
    public static int trap1(int[] arr){
        int n=arr.length;
        if(n==0) return 0;
        int[] leftMax=new int[n];
        int[] rightMax=new int[n];
        leftMax[0]=arr[0];
        for (int i = 1 ;i <n; i++) {
            leftMax[i]=Math.max(leftMax[i-1],arr[i]);
        }
        rightMax[n-1]=arr[n-1];
        for (int i = n-2; i >=0 ; i--) {
            rightMax[i]=Math.max(rightMax[i+1],arr[i]);
        }
        int res=0;
        for (int i = 0; i <n ; i++) {
            res+=Math.min(leftMax[i],rightMax[i])-arr[i];
        }
        return res;
    }
//    86 ms
    public static int trap2(int[] arr){
        int n= arr.length;
        if(n==0) return 0;
        int left=0,right=n-1;
        int leftMax=arr[left],rightMax=arr[right];
        int res=0;
        while (left<right){
            if(leftMax<rightMax){
                left++;
                leftMax=Math.max(leftMax,arr[left]);
                res+=leftMax-arr[left];
            }
            else{
                right--;
                rightMax=Math.max(rightMax,arr[right]);
                res+=rightMax-arr[right];
            }
        }
        return res;
    }
    public static int trap3(int[] arr){
        int n= arr.length;
        if(n==0)return 0;
        int left=0,right=n-1;
        int leftmax=arr[left],rightmax=arr[right];
        int res=0;
        while (left<right){
            if(leftmax<rightmax){
                left++;
                leftmax=Math.max(leftmax,arr[left]);
                res+=leftmax-arr[left];
            }
            else{
                right--;
                rightmax=Math.max(rightmax,arr[right]);
                res+=rightmax-arr[right];
            }

        }
        return res;
    }
}
