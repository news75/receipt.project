import java.math.BigDecimal;

/**
 * Created by giuseppe on 23/09/2016.
 */
public class Tax {

    private final  String[] taxFreeGoods = {"book","food"};

    public Tax() {
    }

    public BigDecimal getEvaluatedValue(String goodDescription){

        for (String good : taxFreeGoods) {
            if (goodDescription.contains(good))
                return new BigDecimal("0.00");
        }

        return null;
    }
}
