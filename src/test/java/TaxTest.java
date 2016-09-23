import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by giuseppe on 23/09/2016.
 */
public class TaxTest {

    @Test
    public void testBooksAreTaxFreeGoods(){
        String goodDescription = "tax free goods are books, for instance";
        Tax tax = new Tax(goodDescription);

        assertEquals(new BigDecimal("0.00"), tax.getEvaluatedValue("tax free goods are books, for instance"));
    }

}