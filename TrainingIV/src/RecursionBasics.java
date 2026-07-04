public class RecursionBasics {
    public static void main(String[] args) {
        prints(5);
        System.out.println();
        print(5);
    }
    public static void prints (int n){
        if(n==0){
            return ;
        }
        System.out.print(n+" ");
        prints(n-1);
    }
    public static void print(int n){
        if(n==0){
            return ;
        }
        print(n-1);
        System.out.print(n+" ");
    }
}
