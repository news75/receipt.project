import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by giuseppe on 23/09/2016.
 */
public class TaxTest {

    private Tax tax;

    @Before
    public void setUp(){
        tax = new Tax();
    }

    @Test
    public void testBooksAreTaxFreeGoods(){

        assertEquals(new BigDecimal("0.00"), tax.getTaxPercentage("tax free goods are books, for instance"));
    }

    @Test
    public void testfoodIsTaxFreeGood(){

        assertEquals(new BigDecimal("0.00"), tax.getTaxPercentage("tax free goods is food, for instance"));
    }

    @Test
    public void testMedicalIsTaxFreeGood(){

        assertEquals(new BigDecimal("0.00"), tax.getTaxPercentage("tax free goods is medical, for instance"));
    }

    @Test
    public void testTaxForImportedGenericGoods(){

        assertEquals(new BigDecimal("0.15"), tax.getTaxPercentage("tax for imported goods"));
    }

    @Test
    public void testTaxForGenericGoods(){

        assertEquals(new BigDecimal("0.10"), tax.getTaxPercentage("Basic sales tax is applicable at a rate of 10% on all goods"));
    }

    @Test
    public void testImportedTaxFreeGoods(){

        assertEquals(new BigDecimal("0.05"), tax.getTaxPercentage("tax 0.05 for imported books goods"));
    }

    @Test
    public void testGood(){
        Good good = new Good("13 book at 14.99", new ItemDetails(), new Tax());
        BigDecimal taxPercentage = new BigDecimal("0.0");
        BigDecimal goodPrice = new BigDecimal("14.99");
        assertEquals(new BigDecimal("0.00"), good.taxAmmount(goodPrice, taxPercentage));
    }

}