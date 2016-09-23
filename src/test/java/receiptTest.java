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
        itemDetails = new ItemDetails();
        itemDetails.parse(" 1 imported bottle of perfume at 12.49 ");
    }

    @Test
    public void testCreation(){
        ItemDetails itemDetails = new ItemDetails();

        assertEquals(0,itemDetails.quantity());
        assertEquals(new BigDecimal("0"),itemDetails.price());
        assertEquals("",itemDetails.description());
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
    public void testItemDetailDescription(){

        String actual = itemDetails.description();

        assertEquals("imported bottle of perfume",actual);
    }
}