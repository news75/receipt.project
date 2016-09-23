import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by giuseppe on 23/09/2016.
 */
public class TaxTest {

    @Test
    public void testTaxOfTenPercentOnGenericGoods(){
        String goodDescription = "Basic sales tax is applicable at a rate of 10% on all goods";
        Tax tax = new Tax(goodDescription);

        tax.evaluate();

        assertEquals(new BigDecimal("0.10"), tax.getValue());
    }

}