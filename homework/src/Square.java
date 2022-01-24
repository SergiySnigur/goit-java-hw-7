public class Square extends Shape implements Scalable {
    private float dimension;
    private String name;

    public Square(double positionX, double positionY, Color color, String name, float dimension) {
        super(positionX, positionY, color);
        this.dimension = dimension;
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getArea() {
        return this.dimension * this.dimension;
    }

    @Override
    public double getLength() {
        return this.dimension * 4;
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
        return this.dimension * this.dimension * scale;
    }
}
