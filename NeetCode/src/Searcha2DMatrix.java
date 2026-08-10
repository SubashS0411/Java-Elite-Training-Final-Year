public class Searcha2DMatrix {
    public static void main(String[] args) {
        System.out.println(searchMatrix((new int[][]{{1,2,4,8},{10,11,12,13},{14,20,30,40}}),90));;
    }
    public static boolean searchMatrix(int[][] matrix,int target){
        if(matrix.length==0||matrix==null||matrix[0].length==0){
            return false;
        }
        int low=0;
        int high=(matrix.length* matrix[0].length)-1;
        while (low<=high){
            int mid=low+(high-low)/2;
            int midvalue=matrix[mid/ matrix[0].length][mid% matrix[0].length];
            if(midvalue==target) {
                return true;
            } else if (midvalue<target) {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return false;
    }
}
