import java.math.BigDecimal;

/**
 * Created by giuseppe on 24/09/2016.
 */
class FakeItemDetails extends ItemDetails {
    private String description;
    private BigDecimal price;

    public ItemDetails initWithDescription(String description) {
        this.description = description;
        this.price = new BigDecimal("0.00");
        return this;
    }

    public ItemDetails initWithPrice(BigDecimal price) {
        this.description = "una descrizione qualunque";
        this.price = price;
        return this;
    }


    @Override
    public String description() {
        return description;
    }

    @Override
    public BigDecimal price() {
        return price;
    }
}
