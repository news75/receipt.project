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
        String quantityToken = itemDetails.split("[ ]+")[0];
        return Integer.parseInt(quantityToken);
    }

    public BigDecimal price() {
        String[] tokens = itemDetails.split("[ ]+");
        String priceToken = tokens[tokens.length - 1];
        return new BigDecimal(priceToken);
    }
}
