import javax.sound.midi.Soundbank;

public class Circle extends Shape implements Scalable {
    public static final float PI = 3.141592f;
    private float radius;
    private String name;

    public Circle(double positionX, double positionY, String name, Color color, float radius) {
        super(positionX, positionY, color);
        this.name = name;
        this.radius = radius;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getArea() {
        return PI * this.radius * this.radius;
    }

    @Override
    public double getLength() {
        return 2 * PI * this.radius;
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

    @Override
    public float scaling(float scale) {
        return this.radius * scale;
    }
}
