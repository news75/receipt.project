import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by giuseppe on 24/09/2016.
 */
public class Good {

    public Good() {

    }

    public static BigDecimal roundingRules(BigDecimal value) {

        return value.divide(new BigDecimal("0.05")).setScale(0, RoundingMode.UP).multiply(new BigDecimal("0.05")).setScale(2);
    }
}
