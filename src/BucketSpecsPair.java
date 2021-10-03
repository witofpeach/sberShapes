import java.util.Objects;

public class BucketSpecsPair {
    private Shape shape;
    private Color color;

    public BucketSpecsPair(Shape shape, Color color) {
        this.shape = shape;
        this.color = color;
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BucketSpecsPair that = (BucketSpecsPair) o;
        return shape == that.shape && color == that.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(shape, color);
    }

    @Override
    public String toString() {
        return "Bucket Specs {" +
                "shape=" + shape +
                ", color=" + color +
                '}';
    }
}
