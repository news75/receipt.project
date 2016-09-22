/**
 * Created by giuseppe on 22/09/2016.
 */
public class Item {
    private String itemDetails;

    public Item(String itemDetails) {

        this.itemDetails = itemDetails;
    }

    public int quantity() {
        String quantityToken = itemDetails.split("[ ]+")[0];
        return Integer.parseInt(quantityToken);
    }
}
