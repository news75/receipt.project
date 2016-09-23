import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by giuseppe on 23/09/2016.
 */
public class TaxTest {

    private Tax tax;

    @Before
    public void setUp(){
        tax = new Tax();
    }

    @Test

    public void testBooksAreTaxFreeGoods(){

        assertEquals(new BigDecimal("0.00"), tax.getEvaluatedValue("tax free goods are books, for instance"));
    }

    @Test
    public void testfoodIsTaxFreeGood(){

        assertEquals(new BigDecimal("0.00"), tax.getEvaluatedValue("tax free goods is food, for instance"));
    }

}