import java.math.BigDecimal;

/**
 * Created by giuseppe on 23/09/2016.
 */
public class Tax {

    private final  String[] taxFreeGoods = {"book","food","medical"};

    public Tax() {
    }

    public BigDecimal getTaxPercentage(String goodDescription){

        BigDecimal percentage = new BigDecimal("0.00");
        if (!isTaxFree(goodDescription))
            percentage = percentage.add(new BigDecimal("0.10"));
        if (goodDescription.contains("imported"))
            percentage = percentage.add(new BigDecimal("0.05"));

        return percentage;
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
