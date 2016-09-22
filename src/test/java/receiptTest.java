import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by giuseppe on 21/09/2016.
 */
public class receiptTest {

    @Test
    public void testParseGood()
    {
        Item item = new Item("1 book at 12.49");

        assertEquals(1,item.quantity());
    }

}