import java.math.BigDecimal;

/**
 * Created by giuseppe on 22/09/2016.
 */
public class ItemDetails {
    private String itemDetails;
    private String descriptionToken;

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

    public String description() {
        String[] tokens = itemDetails.split(" at ");
        String leftTokens = tokens[0];
        String rightTokens = tokens[1];
        String[] quantityDesctiptionTokens = leftTokens.split("[ ]",2);
        String quantityToken = quantityDesctiptionTokens[0];
        descriptionToken = quantityDesctiptionTokens[1];

        return descriptionToken;
    }

    private void parse(){
        String[] tokens = itemDetails.split(" at ");
        String leftTokens = tokens[0];
        String rightTokens = tokens[1];
        String[] quantityDesctiptionTokens = leftTokens.split("[ ]",2);
        String quantityToken = quantityDesctiptionTokens[0];
        descriptionToken = quantityDesctiptionTokens[1];
    }

    private String[] getTokens() {
        return itemDetails.split("[ ]+");
    }

}
