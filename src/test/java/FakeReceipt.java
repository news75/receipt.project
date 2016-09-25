import java.math.BigDecimal;

/**
 * Created by giuseppe on 25/09/2016.
 */
public class FakeReceipt extends Receipt {
    public BigDecimal settedTotal;
    public BigDecimal settedSalesTaxes;

    @Override
    public void setTotal(BigDecimal total) {
        settedTotal = total;
    }

    @Override
    public void setTax(BigDecimal tax) {
        settedSalesTaxes = tax;
    }
}
