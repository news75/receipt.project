import java.math.BigDecimal;
import java.util.List;

/**
 * Created by giuseppe on 25/09/2016.
 */
public class FakeReceipt extends Receipt {
    public boolean settedTotal;
    public boolean settedSalesTaxes;
    public boolean settedOrders;

    @Override
    public void setTotal(BigDecimal total) {
        settedTotal = true;
    }

    @Override
    public void setTax(BigDecimal tax) {
        settedSalesTaxes = true;
    }

    @Override
    public void setOrders(List<Order> orders) {
        settedOrders = true;
    }
}
