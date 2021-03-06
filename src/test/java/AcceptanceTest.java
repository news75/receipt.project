import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by giuseppe on 26/09/2016.
 */
public class AcceptanceTest {
    private Basket basket;
    private Receipt receipt;


    @Before
    public void setUp(){
        basket = new Basket();
        receipt = new Receipt();
    }

    @Test
    public void testDiAccettazioneInput1(){
        basket.add(Order.createFromGoodDescription("1 book at 12.49"));
        basket.add(Order.createFromGoodDescription("1 music CD at 14.99"));
        basket.add(Order.createFromGoodDescription("1 chocolate bar at 0.85"));

        basket.printReceipt(receipt);

        assertEquals("\n" +
                "1 book: 12.49\n" +
                "1 music CD: 16.49\n" +
                "1 chocolate bar: 0.85\n" +
                "Sales Taxes: 1.50\n" +
                "Total: 29.83", receipt.deliver());
    }

    @Test
    public void testDiAccettazioneInput2(){
        basket.add(Order.createFromGoodDescription("1 imported box of chocolates at 10.00"));
        basket.add(Order.createFromGoodDescription("1 imported bottle of perfume at 47.50"));

        basket.printReceipt(receipt);

        assertEquals("\n" +
                "1 imported box of chocolates: 10.50\n" +
                "1 imported bottle of perfume: 54.65\n" +
                "Sales Taxes: 7.65\n" +
                "Total: 65.15", receipt.deliver());
    }

    @Test
    public void testDiAccettazioneInput3(){
        basket.add(Order.createFromGoodDescription("1 imported bottle of perfume at 27.99"));
        basket.add(Order.createFromGoodDescription("1 bottle of perfume at 18.99"));
        basket.add(Order.createFromGoodDescription("1 packet of headache pills at 9.75"));
        basket.add(Order.createFromGoodDescription("1 box of imported chocolates at 11.25"));

        basket.printReceipt(receipt);

        assertEquals("\n" +
                "1 imported bottle of perfume: 32.19\n" +
                "1 bottle of perfume: 20.89\n" +
                "1 packet of headache pills: 9.75\n" +
                "1 box of imported chocolates: 11.85\n" +
                "Sales Taxes: 6.70\n" +
                "Total: 74.68", receipt.deliver());
    }
}