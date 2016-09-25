import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by giuseppe on 25/09/2016.
 */
public class Basket {

    private List<String> goods = new ArrayList<String>();
    private List<Order> orders = new ArrayList<Order>();

    public void add(String goodDescription) {
        goods.add(goodDescription);
        ItemDetails itemDetails = new ItemDetails();
        itemDetails.parse(goodDescription);
        Order order = new Order(itemDetails, new Tax());
        add(order);
    }

    private void add(Order order){
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
        for (String good : goods) {
            ItemDetails itemDetails = new ItemDetails();
            itemDetails.parse(good);
            Order order = new Order(itemDetails, new Tax());
            taxedPrice = taxedPrice.add(order.getTaxedPrice());
        }

        return taxedPrice;
    }
}
