public class SecondLarge {
    public static void main(String[] args) {
        int [] arr={40, 12, 85, 5, 23};
        int large=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int num:arr){
            if(num>large){
                second=large;
                large=num;
            }
            else if(num>second && num!=large){
                second=num;
            }
        }
        System.out.println(second);
    }
}
