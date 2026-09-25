public class MovieTheatreSeatPricing {
    public static void main(String[] args) {
        int n=5;
        int[] book={1 ,2, 5 ,6 ,9 };
        int ticketprice=0;
        for(int element:book){
            if(element%2==0){
                ticketprice+=150;
            }
            else{
                ticketprice+=200;
            }
        }
        System.out.println(ticketprice);
    }
}
