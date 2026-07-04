import java.util.ArrayList;

public class RecursiveFibo {
    public static void main(String[] args) {
        System.out.println(fibo(5));
        System.out.println(gib(5));
    }
    public static int fibo(int n){
        if(n==0) return 0;
        if(n<=1) return 1;
        return fibo(n-1)+fibo(n-2);
    }
    public static ArrayList<Integer> gib(int n){
        ArrayList<Integer> list = new ArrayList<>();
        if(n==0) return list;
        if(n<=1) return list;
        list.add(n);
        gib(n-1);
        return list;
    }
}
