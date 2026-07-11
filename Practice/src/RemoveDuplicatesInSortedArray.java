public class RemoveDuplicatesInSortedArray {
    public static void main(String[] args) {
        int[] arr={1,1,2};
        System.out.println(removeDuplicates(arr));
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }
    public static int removeDuplicates(int[] arr){
        if(arr.length==0){
            return 0;
        }
        int first=1;
        for (int second = 1; second < arr.length; second++) {
            if(arr[second]!=arr[second-1]){
                arr[first]=arr[second];
                first++;
            }
        }
        return first;
    }
}
