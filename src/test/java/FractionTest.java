import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FractionTest {

    @Test
    public void reduction_to_an_int() {
        assertEquals(Fraction.of(6, 3), Fraction.of(2));
        assertEquals(Fraction.of(9, 9), Fraction.of(1));
    }

    @Test
    public void reduction_when_den_divisible_for_num() {
        assertEquals(Fraction.of(3, 6), Fraction.of(1, 2));
    }

    @Test
    public void reduction_when_num_and_den_have_common_divisor() {
        assertEquals(Fraction.of(2, 3), Fraction.of(6, 9));
    }

    @Test
    void reduction_on_fraction_with_sign() {
        assertEquals(Fraction.of(-2), Fraction.of(-6, 3));
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
    public void fraction_plus_zero_remain_the_same() {
        assertEquals(Fraction.of(3, 4), Fraction.of(3, 4).plus(Fraction.of(0)));
        assertEquals(Fraction.of(3, 4), Fraction.of(0).plus(Fraction.of(3, 4)));
    }

    @Test
    public void cannot_instantiate_fractions_with_zero_at_denominator() {
        assertThrows(IllegalArgumentException.class, () -> Fraction.of(2, 0));
    }

    @Test
    public void zero_plus_zero_returns_zero() {
        assertEquals(Fraction.of(0), Fraction.of(0).plus(Fraction.of(0)));
    }

    @Test
    public void int_plus_int_returns_int() {
        assertEquals(Fraction.of(5), Fraction.of(2).plus(Fraction.of(3)));
    }

    @Test
    public void fraction_plus_fraction_returns_fraction() {
        assertEquals(Fraction.of(47, 15), Fraction.of(7, 3).plus(Fraction.of(4, 5)));
    }

    @Test
    void fraction_plus_fraction_returns_int() {
        assertEquals(Fraction.of(1), Fraction.of(1, 2).plus(Fraction.of(1, 2)));
        assertEquals(Fraction.of(1), Fraction.of(1, 3).plus(Fraction.of(2, 3)));
        assertEquals(Fraction.of(2), Fraction.of(2, 3).plus(Fraction.of(4, 3)));
    }

    @Test
    void fraction_with_sign_has_signs_on_numerator_only() {
        assertEquals(Fraction.of(-2, 3), Fraction.of(2, -3));
    }

    @Test
    void fraction_with_sign_on_num_and_den_is_actually_positive() {
        assertEquals(Fraction.of(2, 3), Fraction.of(-2, -3));
    }

    @Test
    void inverse_of_fraction() {
        assertEquals(Fraction.of(4, 3), Fraction.of(3, 4).inverse());
        assertEquals(Fraction.of(3, 4), Fraction.of(4,3).inverse());
        assertEquals(Fraction.of(-3, 4), Fraction.of(-4,3).inverse());
    }

    @Test
    void cannot_invert_a_zero_fraction() {
        assertThrows(IllegalArgumentException.class, () -> Fraction.of(0).inverse());
    }
}
