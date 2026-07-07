import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContainerWithMostWaterTest {

    private ContainerWithMostWater solver;

    // This runs before every single test case to ensure a fresh object
    @BeforeEach
    void setUp() {
        solver = new ContainerWithMostWater();
    }

    @Test
    void testStandardExample() {
        // Example 1 from LeetCode
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int expected = 49;
        int actual = solver.maxArea(height);

        assertEquals(expected, actual, "Should calculate max area of 49 for the standard asymmetrical array");
    }

    @Test
    void testMinimumSizeArray() {
        // Example 2 from LeetCode (Constraints say minimum length is 2)
        int[] height = {1, 1};
        int expected = 1;

        assertEquals(expected, solver.maxArea(height), "Should handle minimum array size of 2");
    }

    @Test
    void testDescendingHeights() {
        // Array where heights strictly decrease. Left pointer should do all the moving.
        int[] height = {5, 4, 3, 2, 1};
        // Width between index 0 (height 5) and index 1 (height 4) is 1. Area = 1 * 4 = 4.
        // Width between index 0 (height 5) and index 2 (height 3) is 2. Area = 2 * 3 = 6.
        int expected = 6;

        assertEquals(expected, solver.maxArea(height), "Should handle strictly descending arrays");
    }

    @Test
    void testUniformHeights() {
        // All walls are the exact same height.
        // The max area will simply be the outermost walls because width is maximized.
        int[] height = {10, 10, 10, 10};
        // Width = 3, Height = 10. Area = 30.
        int expected = 30;

        assertEquals(expected, solver.maxArea(height), "Should maximize width when heights are uniform");
    }
}