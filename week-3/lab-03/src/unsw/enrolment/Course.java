package unsw.enrolment;

import java.util.ArrayList;
import java.util.List;

/**
 * A course in the enrolment system.
 * 
 * @author Robert Clifton-Everest
 *
 */
public class Course {

    private String courseCode;
    private String title;
    private int uoc;
    private List<Course> prereqs;
    private List<CourseOffering> courseOfferings;

    public Course(String courseCode, String title) {
        this.courseCode = courseCode;
        this.prereqs = new ArrayList<Course>();
        this.courseOfferings = new ArrayList<CourseOffering>();
        this.title = title;
        this.uoc = 6;
    }

    public void addPrereq(Course course) {
        prereqs.add(course);
    }

    public void addOffering(CourseOffering offering) {
        courseOfferings.add(offering);
    }

    public String getCourseCode() {
        return courseCode;
    }

    public List<Course> getPrereq() {
        return prereqs;
    }

    public String getTitle() {
        return title;
    }

    public int getUOC() {
        return uoc;
    }

}
