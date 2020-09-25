public class Circle {
    public static final double pi = 3.14159;
    private int x = 0, y = 0;
    private int r = 5;
    public static int no_circles = 0;

    public Circle() {
        super();
        no_circles++;
    }

    public Circle(int x, int y, int r) {
        this();
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public Circle(int x, int y) {
        this(x, y, 4);
        // this.x = x;
        // this.y = y;
        // this.r = 4;
        // no_circles++;
    }

    public double circumference() {
        return 2 * pi * r;
    }

    public double area() {
        return pi * r * r;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        if (r >= 0) {
            this.r = r;
        }
    }

    @Override
    public String toString() {
        String msg = "[" + x + ", " + y + "]";
        return msg;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        if (this.getClass() != obj.getClass()) {
            return false;
        }

        Circle other = (Circle) obj;
        if (this.x == other.x && this.y == other.y && this.r == other.r) {
            return true;
        } else {
            return false;
        }

    }

}