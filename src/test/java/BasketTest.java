import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by giuseppe on 25/09/2016.
 */
public class BasketTest {

    public void createOrder(Basket basket, String goodDescription) {
        ItemDetails itemDetails = new ItemDetails();
        itemDetails.parse(goodDescription);
        Order order = new Order(itemDetails, new Tax());
        basket.add(order);
    }

    @Test
    public void testBasket(){
        Basket basket = new Basket();

        createOrder(basket, "1 book at 12.49");
        createOrder(basket, "1 music CD at 14.99");
        createOrder(basket, "1 chocolate bar at 0.85");

        assertEquals(new BigDecimal("1.50"), basket.salesTaxes());
        assertEquals(new BigDecimal("29.83"), basket.total());
    }
}