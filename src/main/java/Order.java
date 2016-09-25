import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by giuseppe on 24/09/2016.
 */
public class Order {

    private ItemDetails item;
    private Tax tax;

    public Order(ItemDetails item, Tax tax) {
        this.item = item;
        this.tax = tax;
    }

    public static BigDecimal roundingRules(BigDecimal value) {

        return value.divide(new BigDecimal("0.05")).setScale(0, RoundingMode.UP).multiply(new BigDecimal("0.05")).setScale(2);
    }

    public static Order createFromGoodDescription(String goodDescription) {
        ItemDetails itemDetails = new ItemDetails();
        itemDetails.parse(goodDescription);
        return new Order(itemDetails, new Tax());
    }

    public BigDecimal getTaxAmmount() {
        BigDecimal price = item.price();
        BigDecimal taxpercentage = tax.getTaxPercentage(this.item.description());

        return roundingRules(price.multiply(taxpercentage));
    }

    public BigDecimal getTaxedPrice() {
        return item.price().add(getTaxAmmount());
    }
}
