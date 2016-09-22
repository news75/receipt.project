import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by giuseppe on 21/09/2016.
 */
public class receiptTest {

    @Test
    public void testParseItemDescription() {
        Item item = new Item("1 book at 12.49");

        assertEquals(1, item.quantity());
    }

    @Test
    public void test_imparo_ad_usare_lo_split()
    {
        String stringa_da_parsere = "1 book at 12.49";

        String[] tokens = stringa_da_parsere.split("[ ]+");

        assertEquals("1", tokens[0]);
    }

}