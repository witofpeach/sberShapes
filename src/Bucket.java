import java.util.HashSet;

public class Bucket extends HashSet<Figure> {

    Figure glowingFigure;

    BucketSpecsPair bucketSpecsPair;

    @Override
    public boolean add(Figure figure) {
        if (figure.isGlowing()) {
            if (glowingFigure == null) {
                glowingFigure = figure;
            } else if (glowingFigure.getWeight() < figure.getWeight()) {
                glowingFigure.setGlowing(false);
                glowingFigure = figure;
            } else {
                figure.setGlowing(false);
            }
        }
        return super.add(figure);
    }
}
