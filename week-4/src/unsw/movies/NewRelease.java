package unsw.movies;

public class Regular implements Price {
    public double getCharge(int daysRented) {
        return daysRented * 3;
    }
}
