import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by giuseppe on 25/09/2016.
 */
public class Basket {

    private List<Order> orders = new ArrayList<Order>();

    public void add(Order order){
        orders.add(order);
    }

    public BigDecimal salesTaxes() {

        BigDecimal salesTaxes = new BigDecimal("0.00");
        for (Order order : orders) {
            salesTaxes = salesTaxes.add(order.getTaxAmmount());
        }

        return salesTaxes;
    }

    public BigDecimal total() {
        BigDecimal taxedPrice = new BigDecimal("0.00");
        for (Order order : orders) {
            taxedPrice = taxedPrice.add(order.getTaxedPrice());
        }

        return taxedPrice;
    }

    public void printReceipt(Receipt receipt) {
        receipt.setTotal(total());
        receipt.setTax(salesTaxes());
        receipt.setOrders(orders);
    }
}
