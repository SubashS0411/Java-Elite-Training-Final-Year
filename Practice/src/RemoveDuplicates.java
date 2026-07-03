public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr={1, 1, 2, 3, 3};
        System.out.println(Removedup(arr));
    }
    public static int Removedup(int[] arr){
        if(arr.length==0) return 0;
        int index=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                arr[index]=arr[i];
                index++;
            }
        }
        return index;
    }
}
