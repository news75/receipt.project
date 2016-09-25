import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by giuseppe on 24/09/2016.
 */
public class CalculatorTest {

    private Calculator calculator;
    private FakeItemDetails itemDetails;
    private TaxFake tax;

    @Before
    public void setUp(){
        itemDetails = new FakeItemDetails();
        tax = new TaxFake();

        calculator = new Calculator(itemDetails, tax);
    }

    @Test
    public void testRoundingRules(){

        assertEquals(new BigDecimal("1.00"), Calculator.roundingRules(new BigDecimal("1.00")));
        assertEquals(new BigDecimal("1.05"), Calculator.roundingRules(new BigDecimal("1.01")));
        assertEquals(new BigDecimal("1.10"), Calculator.roundingRules(new BigDecimal("1.06")));
    }

    @Test
    public void testTaxKnowTheGood(){
        itemDetails.initWithDescription("passed good");
        tax.initWithTaxPercentage(new BigDecimal("0.00"));

        calculator.getTaxAmmount();

        assertEquals("passed good", tax.goodDescription);
    }

    @Test
    public void testGivenAItemGetPriceAndTaxAmmount(){

        itemDetails.initWithPrice(new BigDecimal("10.00"));
        tax.initWithTaxPercentage(new BigDecimal("0.05"));

        assertEquals(new BigDecimal("0.50"), calculator.getTaxAmmount());
        assertEquals(new BigDecimal("10.50"), calculator.getTaxedPrice());
    }

}