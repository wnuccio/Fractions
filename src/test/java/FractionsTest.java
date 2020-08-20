import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FractionsTest {

    @Test
    public void addTwoFractions() {
        assertEquals(new Fraction(43,15), new Fraction(7,3).add(new Fraction(4,5)));
    }
}
