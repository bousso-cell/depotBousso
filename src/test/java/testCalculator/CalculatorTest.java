package testCalculator;

import calculator.ClassCalculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    /**
     * Rigorous Test :-)
     */
    ClassCalculator calculator;
    @Before
    public void setUp() throws Exception{
        calculator=new ClassCalculator();
    }
    @Test
    public void testSum() {

        // Given
        //Calculator calculator = new Calculator();
        // When
        int result = calculator.sum(2, 2);
        // Then
        if (result != 4) {   // if 2 + 2 != 4
            Assert.fail();
        }
    }

    @Test
    public void testSus() {
        //Calculator calculator = new Calculator();
        Assert.assertEquals(0, calculator.sus(2, 2));
    }
    @Test
    public void testDiv() {
        //Calculator calculator = new Calculator();
        Assert.assertEquals(2, calculator.div(6, 3));
    }

}
