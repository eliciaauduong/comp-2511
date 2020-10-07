package unsw.enrolment;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String zid;
    private ArrayList<Enrolment> enrolments;
    private List<Session> sessions;

    public Student(String zid) {
        this.zid = zid;
        sessions = new ArrayList<Session>();
        enrolments = new ArrayList<>();
    }

    public String getZID() {
        return zid;
    }

    public ArrayList<Enrolment> getEnrolments() {
        return enrolments;
    }

    public void addSession(Session session) {
        sessions.add(session);
    }

    public void addEnrolment(Enrolment enrolment) {
        enrolments.add(enrolment);
    }

    private boolean checkPrereq(Course course) {
        List<Course> prereqs = course.getPrereq();
        if (prereqs.isEmpty()) {
            return true;
        }
        boolean passed = false;
        for (Course prereq : course.getPrereq()) {
            for (Enrolment e : this.enrolments) {
                Course studentEnrolled = e.getCourse();
                if (studentEnrolled == prereq) {
                    Grade prereqGrade = e.getGrade();
                    if (prereqGrade.getMark() >= 50) {
                        passed = true;
                    }
                }
            }
        }

        return passed;
    }

    private boolean checkOfferingPrereq(CourseOffering offering) {
        return this.checkPrereq(offering.getCourse());
    }

    public Enrolment enrol(CourseOffering offering, Student student) {
        if (!student.checkOfferingPrereq(offering)) {
            System.out.println("ERROR: Must pass all prerequisite courses");
            return null;
        }
        Enrolment enrolment = new Enrolment(offering, student);
        student.addEnrolment(enrolment);
        return enrolment;
    }
}
