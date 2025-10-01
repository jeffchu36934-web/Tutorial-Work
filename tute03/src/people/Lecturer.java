package people;

import java.util.Map;

public class Lecturer extends Person {
    public static final Map<String, Integer> PAY_RATES = Map.of(
        "LVL0", 0,
        "LVL1", 1000,
        "LVL2", 2000,
        "LVL3", 3000
    );

    private int salary;

    public Lecturer(String name, int age, String payRate) {
        super(name, age);
        setSalary(payRate);
        salary = PAY_RATES.get(payRate);
    }


    /**
     * Sets the salary of a person given their pay rate
     * @param payRate New pay rate of the person
     * @precondition payRate must be in PAY_RATES
     * @postcondition salary > 0
     */
    public void setSalary(String payRate) {
        Integer pay = PAY_RATES.get(payRate);
        salary = pay;
    }



}
