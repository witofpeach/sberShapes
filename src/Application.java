import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Figure> inputList = new ArrayList<>();

        // Фигуры на вход
        inputList.add(new Figure(Shape.CIRCLE, Color.GREEN, 1, true));
        inputList.add(new Figure(Shape.CIRCLE, Color.GREEN, 2, true));
        inputList.add(new Figure(Shape.CIRCLE, Color.GREEN, 3, false));
        inputList.add(new Figure(Shape.CIRCLE, Color.GREEN, 4, false));

        inputList.add(new Figure(Shape.CIRCLE, Color.BLUE, 1, false));
        inputList.add(new Figure(Shape.CIRCLE, Color.BLUE, 1, false));
        inputList.add(new Figure(Shape.CIRCLE, Color.BLUE, 2, false));
        inputList.add(new Figure(Shape.CIRCLE, Color.BLUE, 3, true));
        inputList.add(new Figure(Shape.CIRCLE, Color.BLUE, 4, true));
        inputList.add(new Figure(Shape.CIRCLE, Color.BLUE, 5, true));

        inputList.add(new Figure(Shape.SQUARE, Color.GREEN, 1, false));
        inputList.add(new Figure(Shape.SQUARE, Color.GREEN, 1, false));
        inputList.add(new Figure(Shape.SQUARE, Color.GREEN, 1, false));
        inputList.add(new Figure(Shape.SQUARE, Color.GREEN, 2, true));
        inputList.add(new Figure(Shape.SQUARE, Color.GREEN, 3, true));

        inputList.add(new Figure(Shape.SQUARE, Color.YELLOW, 1, true));
        inputList.add(new Figure(Shape.SQUARE, Color.YELLOW, 1, true));
        inputList.add(new Figure(Shape.SQUARE, Color.YELLOW, 2, false));
        inputList.add(new Figure(Shape.SQUARE, Color.YELLOW, 3, false));
        inputList.add(new Figure(Shape.SQUARE, Color.YELLOW, 3, false));

        Buckets buckets = new Buckets();

        for (Figure figure : inputList) {
            buckets.add(figure);
        }


        //Вывод корзин для проверки
        for (Bucket bucket : buckets.values()) {
            System.out.println(bucket.bucketSpecsPair);
            System.out.println(bucket.size());
            System.out.println(bucket);
            System.out.println();
        }
    }
}
