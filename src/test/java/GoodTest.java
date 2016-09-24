import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by giuseppe on 24/09/2016.
 */
public class GoodTest {

    @Test
    public void testRoundingRules(){

        assertEquals(new BigDecimal("1.00"), Good.roundingRules(new BigDecimal("1.00")));
        assertEquals(new BigDecimal("1.05"), Good.roundingRules(new BigDecimal("1.01")));
        assertEquals(new BigDecimal("1.10"), Good.roundingRules(new BigDecimal("1.06")));

    }

    @Test
    public void testGivenAEntryGetPriceAndTaxAmmount(){
        String entry = "1 book at 12.49";

        Calculator calculator = new Calculator();
        calculator.evaluate(entry);

        assertEquals(new BigDecimal("0.00"), calculator.getTaxAmmount());
    }



}