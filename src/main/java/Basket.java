import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by giuseppe on 25/09/2016.
 */
public class Basket {

    private List<String> goods = new ArrayList<String>();

    public void add(String goodDescription) {
        goods.add(goodDescription);
    }

    public BigDecimal salesTaxes() {

        BigDecimal salesTaxes = new BigDecimal("0.00");
        for (String good : goods) {
            ItemDetails itemDetails = new ItemDetails();
            itemDetails.parse(good);
            Order order = new Order(itemDetails, new Tax());
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
