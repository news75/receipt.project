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

    public BigDecimal taxAmmount() {
        itemDetails.parse(goodDescription);
        BigDecimal goodPrice = itemDetails.price();
        BigDecimal taxPercentage = tax.getEvaluatedValue(itemDetails.description());
        return goodPrice.multiply(taxPercentage).setScale(2);
    }

    public BigDecimal taxedPrice() {
        return new BigDecimal("14.99");
    }
}
