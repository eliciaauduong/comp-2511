package staff.test;

import staff.StaffMember;
import staff.Lecturer;

import java.time.LocalDate;

public class StaffTest {
    public void printStaffDetails(StaffMember s) {
        System.out.println(s);
    }

    public void reflexivityTest() {
        System.out.println("Checking if equals() is reflexive...");
        System.out.println("x.equals(x) should return true");
        StaffMember s = new StaffMember("Jeff Bezos", 100000, LocalDate.of(2010, 8, 18), LocalDate.of(2020, 12, 31));
        System.out.println("StaffMember result = " + s.equals(s));

        Lecturer l = new Lecturer("Bill Gates", 100000, LocalDate.of(2010, 7, 1), LocalDate.of(2020, 12, 31), "Science",
                'B');
        System.out.println("Lecturer result = " + l.equals(l));
    }

    public void symmetryTest() {
        System.out.println("Checking if equals() is symmetric...");
        System.out.println("x.equals(y) should return true if and only if y.equals(x) returns true");
        StaffMember s1 = new StaffMember("Jeff Bezos", 100000, LocalDate.of(2010, 8, 18), LocalDate.of(2020, 12, 31));
        StaffMember s2 = new StaffMember("Jeff Bezos", 100000, LocalDate.of(2010, 8, 18), LocalDate.of(2020, 12, 31));
        System.out.println("StaffMember result = " + (s1.equals(s2) && s2.equals(s1)));

        Lecturer l1 = new Lecturer("Bill Gates", 100000, LocalDate.of(2010, 7, 1), LocalDate.of(2020, 12, 31),
                "Science", 'B');
        Lecturer l2 = new Lecturer("Bill Gates", 100000, LocalDate.of(2010, 7, 1), LocalDate.of(2020, 12, 31),
                "Science", 'B');
        System.out.println("Lecturer result = " + (l1.equals(l2) && l2.equals(l1)));
    }

    public void transitivityTest() {
        System.out.println("Checking if equals() is transitive...");
        System.out.println(
                "If x.equals(y) returns true and y.equals(z) returns true, then x.equals(z) should return true");
        StaffMember s1 = new StaffMember("Jeff Bezos", 100000, LocalDate.of(2010, 8, 18), LocalDate.of(2020, 12, 31));
        StaffMember s2 = new StaffMember("Jeff Bezos", 100000, LocalDate.of(2010, 8, 18), LocalDate.of(2020, 12, 31));
        StaffMember s3 = new StaffMember("Jeff Bezos", 100000, LocalDate.of(2010, 8, 18), LocalDate.of(2020, 12, 31));
        System.out.println("StaffMember result = " + ((s1.equals(s2) && s2.equals(s3)) && s1.equals(s3)));

        Lecturer l1 = new Lecturer("Bill Gates", 100000, LocalDate.of(2010, 7, 1), LocalDate.of(2020, 12, 31),
                "Science", 'B');
        Lecturer l2 = new Lecturer("Bill Gates", 100000, LocalDate.of(2010, 7, 1), LocalDate.of(2020, 12, 31),
                "Science", 'B');
        Lecturer l3 = new Lecturer("Bill Gates", 100000, LocalDate.of(2010, 7, 1), LocalDate.of(2020, 12, 31),
                "Science", 'B');
        System.out.println("Lecturer result = " + ((l1.equals(l2) && l2.equals(l3)) && l1.equals(l3)));
    }

    public void consistencyTest() {
        System.out.println("Checking if equals() is consistent...");
        System.out.println("Multiple invocations of x.equals(y) consistently return true or consistently return false");
        StaffMember s1 = new StaffMember("Jeff Bezos", 100000, LocalDate.of(2010, 8, 18), LocalDate.of(2020, 12, 31));
        StaffMember s2 = new StaffMember("Jeff Bezos", 100000, LocalDate.of(2010, 8, 18), LocalDate.of(2020, 12, 31));
        System.out.println("StaffMember result = test 1: " + s1.equals(s2) + " test 2: " + s1.equals(s2));

        Lecturer l1 = new Lecturer("Bill Gates", 100000, LocalDate.of(2010, 7, 1), LocalDate.of(2020, 12, 31),
                "Science", 'B');
        Lecturer l2 = new Lecturer("Bill Gates", 100000, LocalDate.of(2010, 7, 1), LocalDate.of(2020, 12, 31),
                "Science", 'B');
        System.out.println("Lecturer result = test 1: " + l1.equals(l2) + " test 2: " + l1.equals(l2));
    }

    public void nonNullTest() {
        System.out.println("Checking null with equals()...");
        System.out.println("For any non-null reference value x, x.equals(null) should return false");
        StaffMember s1 = new StaffMember("Jeff Bezos", 100000, LocalDate.of(2010, 8, 18), LocalDate.of(2020, 12, 31));
        System.out.println("StaffMember result = " + s1.equals(null));

        Lecturer l1 = new Lecturer("Bill Gates", 100000, LocalDate.of(2010, 7, 1), LocalDate.of(2020, 12, 31),
                "Science", 'B');
        System.out.println("Lecturer result = " + l1.equals(null));
    }

    public static void main(String[] args) {
        StaffTest t = new StaffTest();
        // Creates a StaffMember with a name and salary of your choosing.
        StaffMember s = new StaffMember("Jeff Bezos", 100000, LocalDate.of(2010, 8, 18), LocalDate.of(2020, 12, 31));

        // Creates an instance of Lecturer with a name, salary, school and academic
        // status of your choosing.
        Lecturer l = new Lecturer("Bill Gates", 100000, LocalDate.of(2010, 7, 1), LocalDate.of(2020, 12, 31),
                "Engineering", 'C');

        // Calls printStaffDetails(...) twice with each of the above as arguments.
        t.printStaffDetails(s);
        t.printStaffDetails(l);

        // Tests the equals(..) method of the two classes.
        System.out.println("----------------------");
        t.reflexivityTest();
        System.out.println("----------------------");
        t.symmetryTest();
        System.out.println("----------------------");
        t.transitivityTest();
        System.out.println("----------------------");
        t.consistencyTest();
        System.out.println("----------------------");
        t.nonNullTest();
        System.out.println("----------------------");
        System.out.println("Check if StaffMember = Lecturer:");
        System.out.println("result = " + s.equals(l));
    }

}