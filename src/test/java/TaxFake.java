import java.math.BigDecimal;

/**
 * Created by giuseppe on 24/09/2016.
 */
class TaxFake extends Tax {

    private BigDecimal taxValue;
    public String goodDescription;

    @Override
    public BigDecimal getTaxPercentage(String goodDescription) {
        this.goodDescription = goodDescription;
        return taxValue;
    }

    public TaxFake initWithTaxPercentage(BigDecimal bigDecimal) {
        this.taxValue = bigDecimal;
        return this;
    }
}
