import java.math.BigDecimal;

/**
 * Created by giuseppe on 22/09/2016.
 */
public class ItemDetails {
    private String itemDetails;

    public ItemDetails(String itemDetails) {
        this.itemDetails = itemDetails.trim();
    }

    public int quantity() {
        String quantityToken = getTokens()[0];
        return Integer.parseInt(quantityToken);
    }

    public BigDecimal price() {
        String priceToken = getTokens()[getTokens().length - 1];
        return new BigDecimal(priceToken);
    }

    private String[] getTokens() {
        return itemDetails.split("[ ]+");
    }
}
