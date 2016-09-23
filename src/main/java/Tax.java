import java.math.BigDecimal;

/**
 * Created by giuseppe on 23/09/2016.
 */
public class Tax {

    private String goodDescription;

    public Tax(String goodDescription) {
        this.goodDescription = goodDescription;
    }

    public void evaluate() {
    }

    public BigDecimal getValue() {
        if (goodDescription.contains("book"))
            return new BigDecimal("0.00");
        return null;
    }
}
