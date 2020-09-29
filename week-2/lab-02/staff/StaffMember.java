package staff;

import java.time.LocalDate;
import java.util.Objects;

/**
 * A staff member
 * 
 * @author Robert Clifton-Everest
 * @author Elicia Au Duong
 *
 */
public class StaffMember {
    private String name;
    private int salary;
    private LocalDate hireDate;
    private LocalDate endDate;

    /**
     * A staff member constructor
     * 
     * @param name     staff member's name
     * @param salary   staff member's salary
     * @param hireDate staff member's hire date
     * @param endDate  staff member's end date
     */
    public StaffMember(String name, int salary, LocalDate hireDate, LocalDate endDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
        this.endDate = endDate;
    }

    /**
     * Getter method for staff member's name
     * 
     * @return staff member's name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for staff member's name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter method for staff member's salary
     * 
     * @return staff member's salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * Setter method for staff member's salary
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * Getter method for staff member's hire date
     * 
     * @return staff member's hire date
     */
    public LocalDate getHireDate() {
        return hireDate;
    }

    /**
     * Setter method for staff member's hire date
     */
    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    /**
     * Getter method for staff member's end date
     * 
     * @return staff member's end date
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    /**
     * Setter method for staff member's end date
     */
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        // if (this == obj) {
        // return true;
        // }

        if (this.getClass() != obj.getClass()) {
            return false;
        }

        StaffMember other = (StaffMember) obj;
        if (Objects.equals(this.name, other.name) && this.salary == other.salary
                && this.hireDate.compareTo(other.hireDate) == 0 && this.endDate.compareTo(other.endDate) == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Salary: " + salary + ", Hire Date: " + hireDate + ", End Date: " + endDate;
    }

}
