import java.math.BigDecimal;

/**
 * Created by giuseppe on 22/09/2016.
 */
public class ItemDetails {
    private String itemDetails;
    private String descriptionToken;
    private String quantityToken;
    private String priceToken;

    public ItemDetails() {

    }

    public int quantity() {
        return Integer.parseInt(quantityToken);
    }

    public BigDecimal price() {
        return new BigDecimal(priceToken);
    }

    public String description() {
        return descriptionToken;
    }

    private void parse(){
        String[] tokens = itemDetails.split(" at ");
        String leftTokens = tokens[0];
        priceToken = tokens[1];
        String[] quantityDesctiptionTokens = leftTokens.split("[ ]",2);
        quantityToken = quantityDesctiptionTokens[0];
        descriptionToken = quantityDesctiptionTokens[1];
    }

    public void parse(String itemDetails){
        this.itemDetails = itemDetails.trim();
        parse();
    }

}
