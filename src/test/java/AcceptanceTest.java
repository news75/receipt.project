import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by giuseppe on 26/09/2016.
 */
public class AcceptanceTest {
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