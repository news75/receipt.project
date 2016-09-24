import java.math.BigDecimal;

/**
 * Created by giuseppe on 24/09/2016.
 */
public class Calculator {

    public BigDecimal evaluate(ItemDetails itemDetails, Tax tax) {


        return getTaxAmmount();
    }

    public BigDecimal getTaxAmmount() {
        return new BigDecimal("0.00");
    }
}
