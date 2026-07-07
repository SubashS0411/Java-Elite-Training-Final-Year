public class BestTimeStocks {
    public static void main(String[] args) {
            int[] prices={7,6,4,3,1};
            System.out.println(maxprofit(prices));
            int[] prices1={7,1,5,3,6,4};
        System.out.println(maxprofit(prices1));
    }
    public static int maxprofit(int[] prices){
        int min =prices[0];
        int profit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]< min){
                min =prices[i];
            }
            profit=Math.max(prices[i]- min,profit);
        }
        return profit;
    }
}
