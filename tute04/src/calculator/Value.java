package calculator;

public class Value implements Expression {
    private double val;

    public Value(int val) {
        this.val = val;
    }

    public double compute() {
        return val;
    }
}
