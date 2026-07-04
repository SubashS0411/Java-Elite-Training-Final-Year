import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr={1,5,6,87,98,45};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr,int low,int high){
        if(low>=high) return;
        int s=low;
        int e=high;
        int mid=low+(high-low)/2;
        int pivot=arr[mid];
        while(s<=e){
//            To sort descending change arr[s]>pivot
            while(arr[s]<pivot){
                s++;
            }
            //            To sort descending change arr[e]<pivot
            while(arr[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }
        sort(arr,low,mid);
        sort(arr,mid+1,high);
    }
}
