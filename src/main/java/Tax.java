import java.math.BigDecimal;

/**
 * Created by giuseppe on 23/09/2016.
 */
public class Tax {
    private BigDecimal tax;

    public Tax(String goodDescription) {
    }

    public void evaluate() {
    }

    public BigDecimal getValue() {
        return new BigDecimal("0.10");
    }
}