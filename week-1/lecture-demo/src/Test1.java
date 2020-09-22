public class Test1 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1.getX());
        System.out.println(c1.area());

        Circle c2 = new Circle(2, 4, 10);
        System.out.println(c2.getX());
        System.out.println(c2.area());

        Circle c3 = new Circle(5, 7);
        System.out.println(c3.getX());
        System.out.println(c3.area());

        System.out.println(Circle.no_circles);

        System.out.println(c3);

        Circle c4 = new Circle(2, 4, 10);
        c3 = c4;
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c2 == c4);
    }
}
