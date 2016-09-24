import java.math.BigDecimal;

/**
 * Created by giuseppe on 23/09/2016.
 */
public class Tax {

    private final  String[] taxFreeGoods = {"book","food","medical"};

    public Tax() {
    }

    public BigDecimal getEvaluatedValue(String goodDescription){

        if (isTaxFree(goodDescription))
            return new BigDecimal("0.00");
        if (goodDescription.contains("imported"))
            return new BigDecimal("0.05");

        return new BigDecimal("0.10");
    }

    private boolean isTaxFree(String goodDescription) {
        boolean isTaxFree = false;
        for (String good : taxFreeGoods) {
            if (goodDescription.contains(good))
                isTaxFree = true;
        }
        return isTaxFree;
    }
}
