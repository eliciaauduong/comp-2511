package unsw.movies;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private List<Rental> rentals;

    public Customer(String name) {
        this.name = name;
        this.rentals = new ArrayList<>();
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String getName() {
        return name;
    }

    public String statement() {

        double totalAmount = 0;
        String result = "Rental Record for " + getName() + "\n";

        for (Rental r : rentals) {
            // double thisAmount = 0;
            // int priceCode = r.getMovie().getPriceCode();

            // switch (priceCode) {
            // case Movie.REGULAR:
            // thisAmount += 2;
            // if (r.getDaysRented() > 2)
            // thisAmount += (r.getDaysRented() - 2) * 1.5;
            // break;
            // case Movie.NEW_RELEASE:
            // thisAmount += r.getDaysRented() * 3;
            // break;
            // case Movie.CHILDRENS:
            // thisAmount += 1.5;
            // if (r.getDaysRented() > 3)
            // thisAmount += (r.getDaysRented() - 3) * 1.5;
            // break;
            // }

            double thisAmount = r.getCharge();
            // show figures for this rental
            result += "\t" + r.getTitle() + "\t" + thisAmount + "\n";
            totalAmount += thisAmount;

        }

        // add footer lines
        result += "Amount owed is " + totalAmount + "\n";
        return result;
    }

    public static void main(String[] args) {
        Customer c1 = new Customer("Mary Jane Watson");
        Movie m = new Movie("Gone with the wind", new Regular());
        Rental r = new Rental(m, 3);
        c1.addRental(r);

        m = new Movie("Finding Nemo", new Children());
        r = new Rental(m, 7);
        c1.addRental(r);

        System.out.println(c1.statement());

    }
}
