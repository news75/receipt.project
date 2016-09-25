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

    @Test
    public void testDiAccettazioneInput1(){
        Basket atBasket = new Basket();
        atBasket.add(Order.createFromGoodDescription("1 book at 12.49"));
        atBasket.add(Order.createFromGoodDescription("1 music CD at 14.99"));
        atBasket.add(Order.createFromGoodDescription("1 chocolate bar at 0.85"));

        Receipt receipt = new Receipt();

        atBasket.printReceipt(receipt);

        assertEquals("\n" +
                "1 book: 12.49\n" +
                "1 music CD: 16.49\n" +
                "1 chocolate bar: 0.85\n" +
                "Sales Taxes: 1.50\n" +
                "Total: 29.83", receipt.deliver());

    }
}