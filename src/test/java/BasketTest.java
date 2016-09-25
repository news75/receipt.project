import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by giuseppe on 25/09/2016.
 */
public class BasketTest {
    private Basket basket;

    @Before
    public void setUp(){
        Order order1 = new FakeOrder(null,null).initWithTaxedPriceAndTax("10.00","1.00");
        Order order2 = new FakeOrder(null,null).initWithTaxedPriceAndTax("20.00","2.00");
        basket = new Basket();
        basket.add(order1);
        basket.add(order2);
    }

    @Test
    public void testBasket(){

        assertEquals(new BigDecimal("3.00"), basket.salesTaxes());
        assertEquals(new BigDecimal("30.00"), basket.total());
    }

    @Test
    public void testBasketPrintReceipt(){

        FakeReceipt receipt = new FakeReceipt();

        basket.printReceipt(receipt);

        assertTrue(receipt.settedTotal);
        assertTrue(receipt.settedSalesTaxes);
        assertTrue(receipt.settedOrders);
    }

}