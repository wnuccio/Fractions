import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FractionsTest {

    @Test
    public void return_on_0_plus_0() {
        assertEquals(new Fraction(0), new Fraction(0).add(new Fraction(0)));
    }

    @Ignore
    @Test
    public void addTwoFractions() {
        assertEquals(new Fraction(43,15), new Fraction(7,3).add(new Fraction(4,5)));
    }
}
