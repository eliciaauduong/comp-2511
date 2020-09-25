package example;

/**
 * An employee in the HR system.
 * 
 * @author Elicia Au Duong
 */
public class Employee {
    /**
     * This is the name of the employee.
     */
    private String name;
    /**
     * This is the salary of the employee.
     */
    public int salary;

    /**
     * <p>
     * This is an Employee constructor
     * </p>
     * <img src=
     * "http://businessimpactinc.com/wp-content/uploads/2015/07/cartoon_meeting.jpg"
     * alt="employee">
     * 
     * @see <a href=
     *      "https://webcms3.cse.unsw.edu.au/COMP2511/20T3/resources/53053">Tutorial
     *      2</a>
     * @since 1.0
     * 
     * @param name   name of the employee
     * @param salary salary of the employee
     */
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    /**
     * getter method to extract name
     * 
     * @return the name of the employee
     */
    public String getName() {
        return name;
    }

    /**
     * setter method to set name
     * 
     * @param name set the name of the employee
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getter method to extract salary
     * 
     * @return the salary of the employee
     */
    public int getSalary() {
        return salary;
    }

    /**
     * setter method to set salary
     * 
     * @param salary set the salary of the employee
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return getClass().toString() + ", name = " + name + ", salary = " + salary;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Employee e = (Employee) obj;
        return (name.equals(e.name) && salary == e.salary);
    }
}
