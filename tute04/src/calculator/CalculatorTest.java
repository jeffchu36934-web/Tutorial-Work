package calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Expression e = new Addition(new Value(1), new Value(2));
        assertEquals(3, e.compute());
    }

    @Test
    public void testSubtraction() {
        Expression e = new Subtraction(new Value(1), new Value(2));
        assertEquals(-1, e.compute());
    }

    @Test
    public void testMult() {
        Expression e = new Multiplication(new Value(1), new Value(2));
        assertEquals(2, e.compute());
    }

    @Test
    public void testDiv() {
        Expression e = new Division(new Value(1), new Value(2));
        assertEquals(0.5, e.compute());
    }




    @Test
    public void testIntegration() {
        Calculator calculator = new Calculator(new Subtraction(
            new Addition(
                new Addition(new Value(1), new Value(2)),
                new Division(new Value(3), new Value(4))
            ),
            new Multiplication(
                new Division(new Value(5), new Value(10)),
                new Multiplication(new Value(7), new Value(8))
            )
        ));
        assertEquals(-24.25, calculator.compute(), 0.001);

    }

}
