package calculator;

/**
 * @author Nick Patrikeos
 **/
public class Calculator {
    
    private Expression exp;

    public Calculator(Expression exp) {
        this.exp = exp;
    }

    public double compute() {
        return exp.compute();
    }
}
