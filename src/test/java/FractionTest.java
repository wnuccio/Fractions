import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FractionTest {

    @Test
    public void return_0_on_0_plus_0() {
        assertEquals(Fraction.of(0), Fraction.of(0).plus(Fraction.of(0)));
    }

    @Test
    public void return_5_on_2_plus_3() {
        assertEquals(Fraction.of(5), Fraction.of(2).plus(Fraction.of(3)));
    }


    @Test
    public void reduction_when_num_divisible_for_den() {
        assertEquals(Fraction.of(6, 3), Fraction.of(2));
    }

    @Test
    public void reduction_when_den_divisible_for_num() {
        assertEquals(Fraction.of(3, 6), Fraction.of(1, 2));
    }

    @Test
    public void fractions_equals() {
        assertEquals(Fraction.of(3, 4), Fraction.of(3, 4));
        assertEquals(Fraction.of(3, 2), Fraction.of(3, 2));
    }

    @Test
    public void fractions_not_equals() {
        assertNotEquals(Fraction.of(1, 3), Fraction.of(1, 4));
        assertNotEquals(Fraction.of(1, 3), Fraction.of(2, 3));
    }

    @Test
    public void reduced_fractions_equals() {
        assertEquals(Fraction.of(6, 3), Fraction.of(12, 6));
    }

    @Test
    public void reduction_when_num_and_den_have_common_divisor() {
        assertEquals(Fraction.of(2, 3), Fraction.of(6, 9));
    }

    @Disabled
    @Test
    public void fraction_plus_zero_remain_the_same() {
        assertEquals(Fraction.of(3, 4), Fraction.of(3, 4).plus(Fraction.of(0)));
        assertEquals(Fraction.of(3, 4), Fraction.of(0).plus(Fraction.of(3, 4)));
    }

    @Test
    public void cannot_instantiate_fractions_with_zero_at_denominator() {
        assertThrows(IllegalArgumentException.class, () -> Fraction.of(2, 0));
    }

    @Disabled
    @Test
    public void return_sum_between_int_and_fraction_with_not_reduced_result() {
        assertEquals(Fraction.of(5), Fraction.of(2).plus(Fraction.of(3)));
    }

    @Test
    @Disabled
    public void addTwoFractions() {
        assertEquals(Fraction.of(43,15), Fraction.of(7,3).plus(Fraction.of(4,5)));
    }
}
