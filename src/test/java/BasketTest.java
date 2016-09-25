import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by giuseppe on 25/09/2016.
 */
public class BasketTest {

    public Order createOrder(String goodDescription) {
        ItemDetails itemDetails = new ItemDetails();
        itemDetails.parse(goodDescription);
        return new Order(itemDetails, new Tax());
    }

    @Test
    public void testBasket(){
        Basket basket = new Basket();

        basket.add(createOrder("1 book at 12.49"));
        basket.add(createOrder("1 music CD at 14.99"));
        basket.add(createOrder("1 chocolate bar at 0.85"));

        assertEquals(new BigDecimal("1.50"), basket.salesTaxes());
        assertEquals(new BigDecimal("29.83"), basket.total());
    }
}