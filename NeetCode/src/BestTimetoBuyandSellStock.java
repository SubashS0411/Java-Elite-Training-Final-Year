public class BestTimetoBuyandSellStock {
    public static void main(String[] args) {
//        System.out.println(maxProfit(new int[]{10,1,5,6,7,1}));
//        System.out.println(maxProfit1(new int[]{10,1,5,6,7,1}));
        System.out.println(maxProfit2(new int[]{10,1,5,6,7,1}));
    }
//    76ms
    public static int maxProfit(int[] arr){
        int minprice=Integer.MAX_VALUE;
        int profit=0;
        for (int ele:arr){
            if(ele<minprice){
                minprice=ele;
            } else if (ele-minprice>profit) {
                profit=ele-minprice;
            }
        }
        return profit;
    }
//    Two pointer Approach
//    65ms
    public static int maxProfit1(int[] arr){
        int l=0,r=1;
        int maxp=0;
        while(r< arr.length){
            if(arr[l]<arr[r]){
                int profit=arr[r]-arr[l];
                maxp=Math.max(maxp,profit);
            }
            else{
                l=r;
            }
            r++;
        }
        return maxp;
    }
//  Dynamic Programming
//    62ms
public static int maxProfit2(int[] arr){
        int minBuy=arr[0];
        int maxp=0;
        for (int element:arr){
            maxp=Math.max(maxp,element-minBuy);
            minBuy=Math.min(minBuy,element);
        }
        return maxp;
}

}
