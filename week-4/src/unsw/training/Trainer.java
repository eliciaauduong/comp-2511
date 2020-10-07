package unsw.training;

import java.util.List;

/**
 * A trainer that runs in person seminars.
 *
 * @author Robert Clifton-Everest
 *
 */
public class Trainer {

    private String name;
    private String room;

    private List<Seminar> seminars;

    public List<Seminar> getSeminars() {
        return seminars;
    }

    public LocalDate book(String employee, List<LocalDate> availability) {
        for (Seminar seminar : seminars) {
            LocalDate booking = seminar.book(employee, availability);
            if (booking != null) {
                return booking;
            }
        }
        return null;
    }
}
