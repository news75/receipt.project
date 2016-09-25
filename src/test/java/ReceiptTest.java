import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by giuseppe on 25/09/2016.
 */
public class ReceiptTest {

    @Test
    public void testEmptyReceipt(){
        Order[] orders = new Order[] {};
        Receipt receipt = new Receipt();

        receipt.setOrders(orders);
        receipt.setTax(new BigDecimal("0.00"));
        receipt.setTotal(new BigDecimal("0.00"));

        String deliver = receipt.deliver();

        assertEquals("\\nSales Taxes: 0.00\\nTotal: 0.00",deliver);
    }
}