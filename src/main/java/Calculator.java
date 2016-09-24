import java.math.BigDecimal;

/**
 * Created by giuseppe on 24/09/2016.
 */
public class Calculator {

    public BigDecimal getTaxAmmount(ItemDetails itemDetails, Tax tax) {
        BigDecimal price = itemDetails.price();
        BigDecimal taxpercentage = tax.getTaxPercentage(itemDetails.description());

        return Good.roundingRules(price.multiply(taxpercentage));
    }

}
