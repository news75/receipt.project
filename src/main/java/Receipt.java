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

        String header = "";
        for (Order order : orders) {
            BigDecimal taxedPrice = order.getTaxedPrice();
            String description = order.getDescription();
            int quantity = order.getQuantity();
            header = String.format("\n%d %s: %s", quantity, description, taxedPrice);
        }

        return String.format("%s\nSales Taxes: %s\nTotal: %s",header, tax, total);
    }
}
