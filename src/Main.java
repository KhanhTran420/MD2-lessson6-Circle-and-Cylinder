public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(2.0,"Blue");
        System.out.println(c);
        System.out.println(c.getArea());

        Cylinder cylinder = new Cylinder(6.0, 2.0, "red");
        System.out.println(cylinder);
        System.out.println(cylinder.getArea());
        System.out.println(cylinder.getAdd());
    }
}
