import java.math.BigDecimal;

/**
 * Created by giuseppe on 25/09/2016.
 */
public class Receipt {
    private Order[] orders;
    private BigDecimal tax;
    private BigDecimal total;

    public void setOrders(Order[] orders) {
        this.orders = orders;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String deliver() {
        return String.format("\\nSales Taxes: %s\\nTotal: %s", tax, total);
    }
}
