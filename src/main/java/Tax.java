import java.math.BigDecimal;

/**
 * Created by giuseppe on 23/09/2016.
 */
public class Tax {

    private String goodDescription;

    public Tax() {
    }

    public BigDecimal getEvaluatedValue(String goodDescription){
        if (goodDescription.contains("book"))
            return new BigDecimal("0.00");
        return null;
    }
}
