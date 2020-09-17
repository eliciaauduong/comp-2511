package example;

public class Shouter {
    private String message;

    public Shouter(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    // returns a string version of the class
    public String toString() {
        return "Shouter message = " + message;
    }

    public void printMe() {
        System.out.println(this);
    }

    public void shout() {
        System.out.println(message.toUpperCase());
    }

    public static void main(String[] args) {
        Shouter s = new Shouter("Vas Happenin'");
        s.printMe();
        System.out.println(s);
        s.shout();
    }
}
