import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FractionTest {

    @Test
    public void return_0_on_0_plus_0() {
        assertEquals(new Fraction(0), new Fraction(0).plus(new Fraction(0)));
    }

    @Test
    public void return_5_on_2_plus_3() {
        assertEquals(new Fraction(5), new Fraction(2).plus(new Fraction(3)));
    }


    @Test
    public void reduction_when_num_divisible_for_den() {
        assertEquals(new Fraction(6, 3), new Fraction(2));
    }

    @Test
    public void reduction_when_den_divisible_for_num() {
        assertEquals(new Fraction(3, 6), new Fraction(1, 2));
    }

    @Test
    public void fractions_equals() {
        assertEquals(new Fraction(3, 4), new Fraction(3, 4));
        assertEquals(new Fraction(3, 2), new Fraction(3, 2));
    }

    @Test
    public void fractions_not_equals() {
        assertNotEquals(new Fraction(1, 3), new Fraction(1, 4));
        assertNotEquals(new Fraction(1, 3), new Fraction(2, 3));
    }

    @Test
    public void reduced_fractions_equals() {
        assertEquals(new Fraction(6, 3), new Fraction(12, 6));
    }

    @Disabled
    @Test
    public void reduction_when_num_and_den_have_common_divisor() {
        assertEquals(new Fraction(6, 9), new Fraction(2, 3));
    }

    @Disabled
    @Test
    public void fraction_plus_zero_remain_the_same() {
        assertEquals(new Fraction(3, 4), new Fraction(3, 4).plus(new Fraction(0)));
        assertEquals(new Fraction(3, 4), new Fraction(0).plus(new Fraction(3, 4)));
    }

    @Test
    public void cannot_instantiate_fractions_with_zero_at_denominator() {
        assertThrows(IllegalArgumentException.class, () -> new Fraction(2, 0));
    }

    @Disabled
    @Test
    public void return_sum_between_int_and_fraction_with_not_reduced_result() {
        assertEquals(new Fraction(5), new Fraction(2).plus(new Fraction(3)));
    }


    @Test
    @Disabled
    public void addTwoFractions() {
        assertEquals(new Fraction(43,15), new Fraction(7,3).plus(new Fraction(4,5)));
    }
}
