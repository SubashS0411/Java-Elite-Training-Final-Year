public class KokoEatingBananas {
    public static void main(String[] args) {
        System.out.println(minEatingSpeed((new int[]{1,4,3,2}),9));
        System.out.println(minEatingSpeed((new int[]{25,10,23,4}),4));
    }
    public static int minEatingSpeed(int[] piles,int hours){
        int left=1;
        int right=1;
        for (int pile:piles){
            right=Math.max(right,pile);
        }
        int result=right;
        while (left<=right){
            int mid=left+(right-left)/2;
            long thours=0;
            for(int pile:piles){
//                thours+=Math.ceil((double) pile/(double) hours);
                thours+=(pile+mid-1)/mid;
            }
            if(thours<=hours){
                result=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return result;
    }
}
