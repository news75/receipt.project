import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by giuseppe on 23/09/2016.
 */
public class TaxEvaluetorTest {

    @Test
    public void testTaxOfTenPercentOnGenericGoods(){
        String goodDescription = "Basic sales tax is applicable at a rate of 10% on all goods";
        TaxEvaluetor taxEvaluetor = new TaxEvaluetor(goodDescription);

        taxEvaluetor.evaluate();

        assertEquals(new BigDecimal("0.10"), taxEvaluetor.getTax());
    }

}