import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by giuseppe on 24/09/2016.
 */
public class GoodTest {

    @Test
    public void testRoundingRules(){

        assertEquals(new BigDecimal("20.00"), Good.roundingRules(new BigDecimal("1.00")));
        assertEquals(new BigDecimal("21.00"), Good.roundingRules(new BigDecimal("1.01")));
        assertEquals(new BigDecimal("22.00"), Good.roundingRules(new BigDecimal("1.06")));

    }



}