import java.math.BigDecimal;

/**
 * Created by giuseppe on 24/09/2016.
 */
public class Good {
    public Good(String goodDescription) {

    }

    public BigDecimal taxAmmount() {
        return new BigDecimal("0.00");
    }

    public BigDecimal taxedPrice() {
        return new BigDecimal("14.99");
    }
}
