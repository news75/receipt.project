import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by giuseppe on 25/09/2016.
 */
public class ReceiptTest {
    private List<Order> orders;
    private Receipt receipt;

    @Before
    public void setUp(){
        orders = new ArrayList<Order>();
        receipt = new Receipt();
    }

    @Test
    public void testEmptyReceipt(){
        receipt.setOrders(orders);
        receipt.setTax(new BigDecimal("0.00"));
        receipt.setTotal(new BigDecimal("0.00"));

        String deliver = receipt.deliver();

        assertEquals("\nSales Taxes: 0.00\nTotal: 0.00",deliver);
    }

    @Test
    public void testReceipt(){
        ItemDetails itemDetails = new FakeItemDetails().initWithDescriptionAndQuantity("book", 1);
        orders.add(new FakeOrder(itemDetails,null).initWithTaxedPriceAndTax("10.00","1.00"));
        orders.add(new FakeOrder(itemDetails,null).initWithTaxedPriceAndTax("10.00","1.00"));

        receipt.setOrders(orders);
        receipt.setTax(new BigDecimal("1.00"));
        receipt.setTotal(new BigDecimal("10.00"));

        String deliver = receipt.deliver();

        assertEquals("\n1 book: 10.00\n1 book: 10.00\nSales Taxes: 1.00\nTotal: 10.00",deliver);
    }
}