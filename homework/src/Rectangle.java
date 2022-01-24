public class Rectangle extends Shape implements Scalable {
    private String name;
    private float width;
    private float height;


    public Rectangle(double positionX, double positionY, Color color, String name, float width, float height) {
        super(positionX, positionY, color);
        this.name = name;
        this.height = height;
        this.width = width;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getArea() {
        return this.height * this.width;
    }

    @Override
    public double getLength() {
        return this.height * 2 + this.width * 2;
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
        return this.width * this.height * scale;
    }
}
