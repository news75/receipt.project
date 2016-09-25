import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by giuseppe on 25/09/2016.
 */
public class BasketTest {

    @Test
    public void testBasket(){
        Order order1 = new FakeOrder(null,null).initWithTaxedPriceAndTax("10.00","1.00");
        Order order2 = new FakeOrder(null,null).initWithTaxedPriceAndTax("20.00","2.00");

        Basket basket = new Basket();

        basket.add(order1);
        basket.add(order2);

        assertEquals(new BigDecimal("3.00"), basket.salesTaxes());
        assertEquals(new BigDecimal("30.00"), basket.total());
    }
}