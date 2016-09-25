import java.math.BigDecimal;

/**
 * Created by giuseppe on 24/09/2016.
 */
public class Calculator {

    private ItemDetails item;
    private Tax tax;

    public Calculator(ItemDetails item, Tax tax) {
        this.item = item;
        this.tax = tax;
    }

    public BigDecimal getTaxAmmount() {
        BigDecimal price = item.price();
        BigDecimal taxpercentage = tax.getTaxPercentage(this.item.description());

        return Good.roundingRules(price.multiply(taxpercentage));
    }

    public BigDecimal getTaxedPrice() {
        return item.price().add(getTaxAmmount());
    }
}
