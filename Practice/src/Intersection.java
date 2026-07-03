import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Intersection {
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4};
        int[] arr1={3, 4, 5, 6};
        System.out.println(Arrays.toString(Inter(arr, arr1)));
    }
    public static int[] Inter(int[] arr, int[] arr1) {
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int num:arr){
            set.add(num);
        }
        for(int num:arr1){
            if(set.contains(num)){
                list.add(num);
                set.remove(num);
            }
        }
        return list.stream().mapToInt(i->i).toArray();
       /* TestCase:
        Test Case 1: Simple Intersection

        nums1 = [1, 2, 3, 4]

        nums2 = [3, 4, 5, 6]

        Expected Output: [3, 4]

        Why: Tests that it can find basic overlapping numbers.

        Test Case 2: One Array is a Subset of the Other

        nums1 = [1, 2, 3]

        nums2 = [1, 2, 3, 4, 5]

        Expected Output: [1, 2, 3]

        Why: Tests what happens when every number in the first array is a match.

        2. The Duplicate Cases (The Logic Testers)
        These test the exact logic we discussed earlier regarding the HashSet and the set.remove() trick.

                Test Case 3: Duplicates only in Array 1

        nums1 = [1, 1, 2, 2, 2]

        nums2 = [2]

        Expected Output: [2]

        Why: Proves that the HashSet successfully ignores duplicates when storing the first array.

        Test Case 4: Duplicates only in Array 2

        nums1 = [4, 9, 5]

        nums2 = [9, 4, 9, 8, 4]

        Expected Output: [9, 4] (or [4, 9], order doesn't matter)

        Why: Proves that your set.remove(num) trick successfully neutralizes duplicates in the second array.

        Test Case 5: Duplicates in BOTH Arrays

        nums1 = [2, 2]

        nums2 = [2, 2]

        Expected Output: [2]

        Why: The ultimate duplicate test. Ensures that multiple 2s in both places only result in a single 2 in the final answer.

        3. The Edge Cases (Boundary Conditions)
        These test how the code handles weird or empty data.

        Test Case 6: No Intersection

        nums1 = [1, 2, 3]

        nums2 = [4, 5, 6]

        Expected Output: [] (Empty Array)

        Why: Ensures the code doesn't crash if it never finds a match.

        Test Case 7: One Array is Empty

        nums1 = []

        nums2 = [1, 2, 3]

        Expected Output: []

        Why: Ensures the loop handles an empty array safely without throwing an IndexOutOfBounds or NullPointer exception.

                Test Case 8: Both Arrays are Empty

        nums1 = []

        nums2 = []

        Expected Output: []

        */
    }
}
