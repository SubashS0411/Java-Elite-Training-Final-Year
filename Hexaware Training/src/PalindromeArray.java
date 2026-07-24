import java.util.Arrays;
import java.util.Scanner;

public class PalindromeArray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=s.nextInt();
        }
        if(ispalindrome(arr)) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
    public static boolean ispalindrome(int[] arr){
        if(arr.length==1) return true;
        int left=0;
        int right= arr.length-1;
        while (left<right){
            if(arr[left]!=arr[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public class ArrayUtils {
        public static int removeDuplicates(int[] nums) {
            // Handle empty or single-element arrays
            if (nums == null || nums.length == 0) {
                return 0;
            }

            // 'i' is the slow pointer tracking the last unique element position
            int i = 0;

            // 'j' is the fast pointer exploring the array
            for (int j = 1; j < nums.length; j++) {
                // If a new unique element is found
                if (nums[j] != nums[i]) {
                    i++; // Move unique tracker forward
                    nums[i] = nums[j]; // Update next position with the unique element
                }
            }

            // The number of unique elements is index + 1
            return i + 1;
        }

        public static void main(String[] args) {
            int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};
//{1,2,3,4,5.4.4.5}
            int uniqueCount = removeDuplicates(nums);

            System.out.println("Number of unique elements: " + uniqueCount);
            System.out.print("Modified unique array: ");
            for (int k = 0; k < uniqueCount; k++) {
                System.out.print(nums[k] + " ");
            }
        }
    }

}
