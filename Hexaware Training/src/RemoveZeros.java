public class RemoveZeros {
    public static void main(String[] args) {
        int[] arr={1,2,3,0,10,24,0,8,0};
        int remove=removeZeros(arr);
        for (int i = 0; i < remove; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static int removeZeros(int[]arr){
        int i=0;
        for (int j = 0; j < arr.length ; j++) {
            if(arr[j]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
        }
        return i;
    }
}
