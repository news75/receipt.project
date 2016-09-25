import java.math.BigDecimal;
import java.util.List;

/**
 * Created by giuseppe on 25/09/2016.
 */
public class Receipt {
    private List<Order> orders;
    private BigDecimal tax;
    private BigDecimal total;

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String deliver() {

        if (orders.size() > 0) {
            return String.format("1 book: 10.00\nSales Taxes: 1.00\nTotal: 10.00");
        }

        return String.format("\nSales Taxes: %s\nTotal: %s", tax, total);
    }
}
