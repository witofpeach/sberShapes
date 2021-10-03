import java.util.Objects;

public class Figure {
    private Shape shape;
    private Color color;
    private int weight;
    private boolean isGlowing;

    public Figure(Shape shape, Color color, int weight, boolean isGlowing) {
        this.shape = shape;
        this.color = color;
        this.weight = weight;
        this.isGlowing = isGlowing;
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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isGlowing() {
        return isGlowing;
    }

    public void setGlowing(boolean glowing) {
        isGlowing = glowing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Figure figure = (Figure) o;
        return weight == figure.weight && shape == figure.shape && color == figure.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(shape, color, weight);
    }

    @Override
    public String toString() {
        return "Figure{" +
                "weight=" + weight +
                ", isGlowing=" + isGlowing +
                '}';
    }
}
