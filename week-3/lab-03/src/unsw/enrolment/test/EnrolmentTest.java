package unsw.enrolment.test;

import unsw.enrolment.Course;
import unsw.enrolment.CourseOffering;
import unsw.enrolment.Lecture;
import unsw.enrolment.Student;
import unsw.enrolment.Enrolment;
import unsw.enrolment.Grade;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class EnrolmentTest {

        public static void main(String[] args) {

                // Create courses
                Course comp1511 = new Course("COMP1511", "Programming Fundamentals");
                Course comp1531 = new Course("COMP1531", "Software Engineering Fundamentals");
                comp1531.addPrereq(comp1511);
                Course comp2521 = new Course("COMP2521", "Data Structures and Algorithms");
                comp2521.addPrereq(comp1511);

                CourseOffering comp1511Offering = new CourseOffering(comp1511, "19T1");
                CourseOffering comp1531Offering = new CourseOffering(comp1531, "19T1");
                CourseOffering comp2521Offering = new CourseOffering(comp2521, "19T2");

                // Create some sessions for the courses
                Lecture mon11 = new Lecture("J17", DayOfWeek.of(1), LocalTime.of(11, 00, 00), LocalTime.of(12, 00, 00),
                                "Lecturer A");
                comp1511Offering.addSession(mon11);
                Lecture wed10 = new Lecture("K17", DayOfWeek.of(3), LocalTime.of(10, 00, 00), LocalTime.of(12, 00, 00),
                                "Lecturer B");
                comp1531Offering.addSession(wed10);
                Lecture fri5 = new Lecture("J17", DayOfWeek.of(5), LocalTime.of(17, 00, 00), LocalTime.of(19, 00, 00),
                                "Lecturer C");
                comp2521Offering.addSession(fri5);

                // Create a student
                Student studentA = new Student("z1234567");

                // Enrol the student in COMP1511 for T1 (this should succeed)
                Enrolment stu1511 = studentA.enrol(comp1511Offering, studentA);
                studentA.addSession(mon11);
                System.out.println(stu1511);
                System.out.println(mon11);

                System.out.println("--------------------");
                // Enrol the student in COMP1531 for T1 (this should fail as they
                // // have not met the prereq)
                Enrolment stu1531 = studentA.enrol(comp1531Offering, studentA);
                System.out.println(stu1531);

                System.out.println("--------------------");
                // // Give the student a passing grade for COMP1511
                Grade stu1511grade = stu1511.getGrade();
                stu1511grade.setMark(50);

                // // Enrol the student in 2521 (this should succeed as they have met
                // // the prereqs)
                Enrolment stu2521 = studentA.enrol(comp2521Offering, studentA);
                System.out.println(stu2521);
                studentA.addSession(fri5);
                System.out.println(fri5);
        }
}
