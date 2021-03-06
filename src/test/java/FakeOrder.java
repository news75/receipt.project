import java.math.BigDecimal;

/**
 * Created by giuseppe on 25/09/2016.
 */
public class FakeOrder extends Order {
    private String price;
    private String taxAmmount;

    public FakeOrder(ItemDetails item, Tax tax) {
        super(item, tax);
    }

    public Order initWithTaxedPriceAndTax(String taxedPrice, String taxAmmount) {
        this.price = taxedPrice;
        this.taxAmmount = taxAmmount;
        return this;
    }

    @Override
    public BigDecimal getTaxAmmount() {
        return new BigDecimal(taxAmmount);
    }

    @Override
    public BigDecimal getTaxedPrice() {
        return new BigDecimal(price);
    }

}
