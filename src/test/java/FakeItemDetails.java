import java.math.BigDecimal;

/**
 * Created by giuseppe on 24/09/2016.
 */
class FakeItemDetails extends ItemDetails {
    private String description;
    private BigDecimal price;
    private int quantity;

    public ItemDetails initWithDescription(String description) {
        this.description = description;
        this.price = new BigDecimal("0.00");
        this.quantity = 0;
        return this;
    }

    public ItemDetails initWithPrice(BigDecimal price) {
        this.description = "una descrizione qualunque";
        this.price = price;
        this.quantity = 0;
        return this;
    }

    public ItemDetails initWithQuantity(int quantity){
        this.description = "una descrizione qualunque";
        this.price = new BigDecimal(0.00);
        this.quantity = quantity;
        return this;
    }

    public ItemDetails initWithDescriptionAndQuantity(String description, int quantity){
        this.description = description;
        this.price = new BigDecimal(0.00);
        this.quantity = quantity;
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

    @Override
    public int quantity() {
        return quantity;
    }
}
