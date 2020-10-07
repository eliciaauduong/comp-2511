package unsw.enrolment;

public class Enrolment {

    private CourseOffering offering;
    private Grade grade;
    private Student student;

    public Enrolment(CourseOffering offering, Student student) {
        this.offering = offering;
        this.student = student;
        this.grade = new Grade();
        offering.addEnrolment(this);
    }

    public Course getCourse() {
        return offering.getCourse();
    }

    public String getTerm() {
        return offering.getTerm();
    }

    public Grade getGrade() {
        return this.grade;
    }

    public Student getStudent() {
        return student;
    }

    @Override
    public String toString() {
        return getStudent().getZID() + " " + getCourse().getCourseCode() + " " + getTerm();
    }

}
