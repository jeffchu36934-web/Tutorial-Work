package people;

public abstract class Person {
    

    private String name;
    private int age;
    private int salary;

    /**
     * 
     * @param name
     * @param age
     * @param payRate
     * @preconditions age > 0, payRate must be in PAY_RATES, name is longer than 1 character
     */
    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    
}
