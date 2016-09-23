import java.math.BigDecimal;

/**
 * Created by giuseppe on 23/09/2016.
 */
public class TaxEvaluetor {
    private BigDecimal tax;

    public TaxEvaluetor(String goodDescription) {
    }

    public void evaluate() {
    }

    public BigDecimal getTax() {
        return new BigDecimal("0.10");
    }
}
