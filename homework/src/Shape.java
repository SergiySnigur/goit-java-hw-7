abstract class Shape implements EditShape {
    protected double positionX;
    protected double positionY;
    protected Color color;

    public Shape(double positionX, double positionY, Color color) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.color = color;
    }

    public abstract String getName();

    public abstract double getArea();

    public abstract double getLength();

    public abstract void draw();

}
