public class Triangle extends Shape implements Scalable {
    private String name;
    private float dimensionA;
    private float dimensionB;
    private float dimensionC;
    private float angel;


    public Triangle(double positionX, double positionY, Color color, String name, float dimensionA, float dimensionB, float dimensionC, float angel) {
        super(positionX, positionY, color);
        this.name = name;
        this.dimensionA = dimensionA;
        this.dimensionB = dimensionB;
        this.dimensionC = dimensionC;
        this.angel = angel;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getArea() {
        return 0.5 * dimensionA * dimensionB * Math.sin(angel);
    }

    @Override
    public double getLength() {
        return this.dimensionA + this.dimensionB + this.dimensionC;
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
        return (float) (0.5 * dimensionA * dimensionB * Math.sin(angel) * scale);
    }
}
