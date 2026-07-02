public class Search {
    public static void main(String[] args) {
        int[] arr ={1,25,45,565,748};
        int n=565;
        int num=LinearSearch(arr,n);
        if(num==-1) System.out.println("Not Found");
        else  System.out.println("Found at : "+num);
        if(sea(arr,n)) System.out.println("Found");
        else System.out.println("Not Found");
    }
    public static int LinearSearch(int[] arr,int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i+1;
            }
        }
        return -1;
    }
    public static boolean sea(int[] arr,int n){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                return true;
            }
        }
        return false;
    }
}
