package unsw.enrolment;

public class Grade {
    private int mark;
    private String grade;

    public Grade(int mark, String grade) {
        this.mark = mark;
        this.grade = grade;
    }

    public Grade() {
        this.mark = 0;
        this.grade = "";
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
        if (mark >= 85)
            grade = "HD";
        if (mark >= 75)
            grade = "D";
        if (mark >= 65)
            grade = "CR";
        if (mark >= 50)
            grade = "P";
        grade = "F";
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

}
