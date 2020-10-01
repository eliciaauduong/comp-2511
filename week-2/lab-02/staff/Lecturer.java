package staff;

import java.time.LocalDate;
import java.util.Objects;

public class Lecturer extends StaffMember {
    public String school;
    public char academicStatus;

    /**
     * lecturer constructor
     * 
     * @param name           lecturer's name
     * @param salary         lecturer's salary
     * @param hireDate       lecturer's hire date
     * @param endDate        lecturer's end date
     * @param school         lecturer's school (e.g. CSE)
     * @param academicStatus lecturer's academic status (e.g A for an Associate
     *                       Lecturer, B for a Lecturer, and C for a Senior
     *                       Lecturer)
     */
    public Lecturer(String name, int salary, LocalDate hireDate, LocalDate endDate, String school,
            char academicStatus) {
        super(name, salary, hireDate, endDate);
        this.school = school;
        this.academicStatus = academicStatus;
    }

    /**
     * getter method to extract school
     * 
     * @return lecturer's school
     */
    public String getSchool() {
        return school;
    }

    /**
     * setter method to set school
     * 
     * @param school lecturer's school
     */
    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * getter method to extract academic status
     * 
     * @return lecturer's academic status
     */
    public char getAcademicStatus() {
        return academicStatus;
    }

    /**
     * setter method to set academic status
     * 
     * @param academicStatus lecturer's academic stauts
     */
    public void setAcademicStatus(char academicStatus) {
        this.academicStatus = academicStatus;
    }

    @Override
    public String toString() {
        String status = "";
        if (academicStatus == 'A') {
            status = "Associate Lecturer";
        } else if (academicStatus == 'B') {
            status = "Lecturer";
        } else if (academicStatus == 'C') {
            status = "Senior Lecturer";
        }
        return super.toString() + ", school: " + school + ", academic status: " + academicStatus + " - " + status;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        Lecturer lec = (Lecturer) obj;
        if (Objects.equals(this.school, lec.school) && this.academicStatus == lec.academicStatus) {
            return true;
        } else {
            return false;
        }
    }
}