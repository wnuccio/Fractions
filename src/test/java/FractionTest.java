import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
    public void fractions_with_same_reduction_are_equals() {
        assertEquals(new Fraction(6, 3), new Fraction(2));
    }

    @Ignore
    @Test
    public void return_sum_between_int_and_fraction_with_not_reduced_result() {
        assertEquals(new Fraction(5), new Fraction(2).plus(new Fraction(3)));
    }

//    @Ignore
//    @Test
//    public void addTwoFractions() {
//        assertEquals(new Fraction(43,15), new Fraction(7,3).add(new Fraction(4,5)));
//    }
}
