import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by giuseppe on 21/09/2016.
 */
public class receiptTest {

    private ItemDetails item;

    @Test
    public void testItemDetailQuantity() {
        ItemDetails item = new ItemDetails("1 book at 12.49");

        int quantity = item.quantity();

        assertEquals(1, quantity);
    }

    @Test
    public void testTrimDescription() {
        item = new ItemDetails(" 1 book at 12.49");

        int actual = item.quantity();

        assertEquals(1, actual);
    }

    @Test
    public void testItemDetailPrice(){
        item = new ItemDetails(" 1 book at 12.49");

        BigDecimal actual = item.price();

        assertEquals(new BigDecimal("12.49"), actual);
    }



    @Test
    public void test_imparo_ad_usare_lo_split()
    {
        String stringa_da_parsere = "1 book at 12.49";

        String[] tokens = stringa_da_parsere.split("[ ]+");

        assertEquals("1", tokens[0]);
    }

}