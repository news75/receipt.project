import java.math.BigDecimal;

/**
 * Created by giuseppe on 24/09/2016.
 */
public class Good {
    private String goodDescription;
    private ItemDetails itemDetails;
    private Tax tax;

    public Good(String goodDescription, ItemDetails itemDetails, Tax tax) {

        this.goodDescription = goodDescription;
        this.itemDetails = itemDetails;
        this.tax = tax;
    }

    public static BigDecimal roundingRules(BigDecimal goodPrice, BigDecimal taxPercentage) {

        return goodPrice.multiply(taxPercentage).setScale(2);
    }
}
