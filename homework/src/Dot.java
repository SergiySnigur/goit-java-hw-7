public class Dot extends Shape {
    private String name;
    private static final int SIZE = 1;


    public Dot(double positionX, double positionY, Color color, String name) {
        super(positionX, positionY, color);
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getArea() {
        return Dot.SIZE;
    }

    @Override
    public double getLength() {
        return Dot.SIZE;
    }

    @Override
    public void draw() {
        color.getColor();
    }

    @Override
    public void move(double x, double y) {
        System.out.println("Move_X: " + (positionX += x));
        System.out.println("Move_X: " + (positionY += y));
    }

    @Override
    public void copy(double x, double y) {
        System.out.println("Copy_X: " + (positionX += x));
        System.out.println("Copy_X: " + (positionY += y));
    }

    @Override
    public void delete() {
        System.out.println("Shape is deleted");
    }
}
