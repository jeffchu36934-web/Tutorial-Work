package people;

public class Tutor extends Person {
    private int payRate;

    /**
     * 
     * @param name
     * @param age
     * @param payRate
     * @postcondition: Only allowed to have lvl0 payrate
     */
    public Tutor(String name, int age, int payRate) {
        super(name, age);
        this.payRate = payRate;
    }

    // /**
    //  * @postcondition return 0
    //  */
    // @Override
    // public int getSalary() {
    //     return 0;
    // }

    // /**
    //  * @postcondition weaker postcondition
    //  */
    // @Override
    // public void setSalary(String payRate) {
    //     return;
    // }

    public int getPayRate() {
        return payRate;
    }

    public void setPayRate(int payRate) {
        this.payRate = payRate;
    }
}
