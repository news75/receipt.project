import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by giuseppe on 24/09/2016.
 */
public class OrderTest {

    private Order order;
    private FakeItemDetails itemDetails;
    private FakeTax tax;

    @Before
    public void setUp(){
        itemDetails = new FakeItemDetails();
        tax = new FakeTax();

        order = new Order(itemDetails, tax);
    }

    @Test
    public void testRoundingRules(){

        assertEquals(new BigDecimal("1.00"), Order.roundingRules(new BigDecimal("1.00")));
        assertEquals(new BigDecimal("1.05"), Order.roundingRules(new BigDecimal("1.01")));
        assertEquals(new BigDecimal("1.10"), Order.roundingRules(new BigDecimal("1.06")));
    }

    @Test
    public void testTaxKnowTheGood(){
        itemDetails.initWithDescription("passed good");
        tax.initWithTaxPercentage(new BigDecimal("0.00"));

        order.getTaxAmmount();

        assertEquals("passed good", tax.goodDescription);
    }

    @Test
    public void testGivenAItemGetPriceAndTaxAmmount(){

        itemDetails.initWithPrice(new BigDecimal("10.00"));
        tax.initWithTaxPercentage(new BigDecimal("0.05"));

        assertEquals(new BigDecimal("0.50"), order.getTaxAmmount());
        assertEquals(new BigDecimal("10.50"), order.getTaxedPrice());
    }

}