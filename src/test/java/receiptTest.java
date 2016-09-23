import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by giuseppe on 21/09/2016.
 */
public class receiptTest {

    private ItemDetails itemDetails;

    @Before
    public void setUp(){
        itemDetails = new ItemDetails("1 book at 12.49");
    }

    @Test
    public void testItemDetailQuantity() {

        int quantity = itemDetails.quantity();

        assertEquals(1, quantity);
    }

    @Test
    public void testItemDetailPrice(){

        BigDecimal actual = itemDetails.price();

        assertEquals(new BigDecimal("12.49"), actual);
    }

    @Test
    public void testTrimDescription() {
        itemDetails = new ItemDetails(" 1 book at 12.49");

        int actual = itemDetails.quantity();

        assertEquals(1, actual);
    }

    @Test
    public void test_imparo_ad_usare_lo_split()
    {
        String stringa_da_parsere = "1 book at 12.49";

        String[] tokens = stringa_da_parsere.split("[ ]+");

        assertEquals("1", tokens[0]);
    }

}