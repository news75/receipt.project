import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by giuseppe on 25/09/2016.
 */
public class ReceiptTest {

    @Test
    public void testEmptyReceipt(){
        List<Order> orders = new ArrayList<Order>();
        Receipt receipt = new Receipt();

        receipt.setOrders(orders);
        receipt.setTax(new BigDecimal("0.00"));
        receipt.setTotal(new BigDecimal("0.00"));

        String deliver = receipt.deliver();

        assertEquals("\nSales Taxes: 0.00\nTotal: 0.00",deliver);
    }

    @Test
    public void testReceipt(){
        List<Order> orders = new ArrayList<Order>();
        orders.add(new FakeOrder(null,null).initWithTaxedPriceAndTax("10.00","1.00"));
        Receipt receipt = new Receipt();

        receipt.setOrders(orders);
        receipt.setTax(new BigDecimal("1.00"));
        receipt.setTotal(new BigDecimal("10.00"));

        String deliver = receipt.deliver();

        assertEquals("1 book: 10.00\nSales Taxes: 1.00\nTotal: 10.00",deliver);
    }
}