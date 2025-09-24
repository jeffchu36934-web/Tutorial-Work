package employee;

import java.time.LocalDate;

public class Manager extends Employee {
    private LocalDate hireDate;

    public Manager(String name, int salary) {
        super(name, salary);
        hireDate = LocalDate.now();
    }
     
    public Manager(String name, int salary, LocalDate hireDate) {
        this(name, salary);
        this.hireDate = hireDate;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    // Maybe it works, but maybe it's not the best
    // public void setHireDate(LocalDate hireDate) {
        
    // }

    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (!super.equals(obj)) return false;

        Manager other = (Manager) obj;

        if (hireDate.equals(other.hireDate)) {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return super.toString() + "hire date: " + hireDate;
    }
}
