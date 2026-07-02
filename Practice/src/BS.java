public class BS {
    public static void main(String[] args) {
        int[] arr ={1,5,45,56,69,79,95};
        int target=56;
        int index=Binary(arr,target);
        if(index!=-1){
            System.out.println("Element found: "+index);
        }
        else{
            System.out.println("ElementNotFound");
        }
//        System.out.println(Binary(arr,target));
    }
    public static int Binary(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        int left=0,right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return -1;
    }
}
