public class SumOfNaturalNumbersRecursion {
    public static void main(String[] args) {
        System.out.println(recursion(5));
        int[] arr= {1,2,3,4,5};
        System.out.println(sum(arr,0)/arr.length);
    }
    public static int recursion(int n){
        if(n==0){
            return n;
        }
        return n+recursion(n-1);
    }
    public static int sum(int[] arr,int index){
        if(index==arr.length-1){
            return 0;
        }
//        int sum=0;
        return arr[index]+sum(arr,index+1);
    }
}
