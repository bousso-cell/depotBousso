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
    // methode ajoutee par Diarra
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
    // methode ajouter par Oumy
    @Test(expected = ArithmeticException.class)
    public void testDivideWillThrowExceptionWhenDivideOnZero() {
        calculator.div(6, 0);
    }
    @Test
    public void testMaximumElt() {
        int []	list= {1,2,7,10};
        Assert.assertEquals(10, calculator.MaxElement(list));

    }

    @Test
    public void testMinimumElt() {
        int []	list= {1,2,7,10};
        Assert.assertEquals(1, calculator.minElement(list));

    }
    // methode ajoutee par Wore
    
    @Test
	public void testMultiply(){
		Assert.assertEquals(12, calculator.multiply(3,4));
	}
    
    @Test
	public void testMin(){
		int min = calculator.min(10,20);
		if (min != 10) Assert.fail();
	}
    
    @Test 
	public void testMax(){
		int max = calculator.max(2000, -2000);
		Assert.assertEquals(2000,max);
	}
}
