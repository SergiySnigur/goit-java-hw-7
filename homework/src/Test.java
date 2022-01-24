public class Test {
    public static void main(String[] args) {
        Shape shape = new Circle(10.0, 20.0, "Circle", new RedColor(), 10f);

        System.out.println("Name of shape: " + shape.getName());
        System.out.println("Area is: " + shape.getArea());
        System.out.println("Length is: " + shape.getLength());
        shape.draw();
        shape.move(10.0, 15.0);
    }
}
