import org.example.Main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class CalculatorTest {
    private Main calculator;

    @Before
    public void setup() {
        calculator = new Main();
    }

    @Test
    public void test_add_positive(){
        double a = 1;
        double b = 2;
        double expectedResult = 3.0;
        Assert.assertEquals(expectedResult, calculator.add(a, b), 0.000001);
    }
}