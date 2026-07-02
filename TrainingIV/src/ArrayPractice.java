import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] arr=new int[6];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;
        arr[5]=6;
//        arr[6]=7;
        int i= arr.length-1;
        while (i>=0){
            System.out.print(arr[i--]+" ");

        }
        System.out.println();
//        for(int i:arr){
//            System.out.print(i+"  ");
//
//        }
//        System.out.println();
//        Arrays.fill(arr,10);
//        for(int i:arr){
//            System.out.print(i+"  ");
//        }
        String[] o={"K","R","I","S","H"};
        for(String s:o){
            System.out.print(s+" ");
        }
        System.out.println();
        boolean[] p={true,false};
        for (boolean k:p){
            System.out.print(k+" ");
        }
    }
}
