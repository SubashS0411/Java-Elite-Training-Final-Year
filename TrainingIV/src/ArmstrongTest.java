import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArmstrongTest {

    @Test
    void testStandardArmstrongNumbers() {
        // 153 is the classic 3-digit Armstrong number: 1^3 + 5^3 + 3^3 = 153
        assertTrue(Armstrong.isArmstrong(153), "153 should be an Armstrong number");
        assertTrue(Armstrong.isArmstrong(370), "370 should be an Armstrong number");
        assertTrue(Armstrong.isArmstrong(371),"371 should be an Armstrog number");
        assertTrue(Armstrong.isArmstrong(1634),"1634 should be an Armstrog number");
    }

    @Test
    void testStandardInvalidArmstrongNumbers() {
        // 154 (your original test number) is NOT an Armstrong number!
        // 1^3 + 5^3 + 4^3 = 1 + 125 + 64 = 190.
        assertFalse(Armstrong.isArmstrong(154), "154 is NOT an Armstrong number");
        assertFalse(Armstrong.isArmstrong(100), "100 is NOT an Armstrong number");
    }
    @Test
    void testStand(){
        assertFalse(Armstrong.isArmstrong(8204),"8208 should be an Armstrong Number");
        assertTrue(Armstrong.isArmstrong(9474),"9474 should be an Armstrong Number");
        assertTrue(Armstrong.isArmstrong(407),"407 should be an Armstrong Number");
    }
    @Test
    void testSingleDigitNumbers() {
        // Any single digit number is technically an Armstrong number (e.g., 5^1 = 5)
        assertTrue(Armstrong.isArmstrong(5), "5 should be an Armstrong number");
        assertTrue(Armstrong.isArmstrong(9), "9 should be an Armstrong number");
        assertTrue(Armstrong.isArmstrong(8),"8 Should be an Armstrong  umber");
    }

    @Test
    void testFourDigitArmstrongNumber() {
        // 1634 is a 4-digit Armstrong number: 1^4 + 6^4 + 3^4 + 4^4 = 1634
        assertTrue(Armstrong.isArmstrong(1634), "1634 should be an Armstrong number");
    }

    @Test
    void testEdgeCases() {
        // 0 is an Armstrong number (0^1 = 0)
        assertTrue(Armstrong.isArmstrong(0), "0 should be considered an Armstrong number");

        // Negative numbers are generally not considered Armstrong numbers
        assertFalse(Armstrong.isArmstrong(-153), "Negative numbers should return false");
    }
}