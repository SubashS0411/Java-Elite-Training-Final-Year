public class SingleNumber {
    public static void main(String[] args) {
        int[] arr={2,2,1};
        int element=0;
        for(int num:arr){
            element^=num;
        }
        System.out.println(element);
    }
}
