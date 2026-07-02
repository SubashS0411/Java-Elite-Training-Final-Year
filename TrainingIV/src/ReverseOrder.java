public class ReverseOrder {
    public static void main(String[] args) {
        int[] arr ={1,5,45,56,69,65,45};
        System.out.println("Reverse Order");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
//            output:
//            Reverse Order
//            45 65 69 56 45 5 1
        }
        int n = arr.length;
        for(int i=0;i< n;i++){
            System.out.println(arr[n-i]+ "");
        }
    }
}
