import java.math.BigDecimal;

/**
 * Created by giuseppe on 24/09/2016.
 */
class FakeTax extends Tax {

    private BigDecimal taxValue;
    public String goodDescription;

    @Override
    public BigDecimal getTaxPercentage(String goodDescription) {
        this.goodDescription = goodDescription;
        return taxValue;
    }

    public FakeTax initWithTaxPercentage(BigDecimal bigDecimal) {
        this.taxValue = bigDecimal;
        return this;
    }
}
