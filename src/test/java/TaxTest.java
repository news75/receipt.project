import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by giuseppe on 23/09/2016.
 */
public class TaxTest {

    @Test
    public void testTaxFreeGoods(){
        String goodDescription = "tax free goods are books for instance";
        Tax tax = new Tax(goodDescription);

        tax.evaluate();

        assertEquals(new BigDecimal("0.00"), tax.getValue());
    }

}