import java.util.List;

public class Main {
    public static void main(String[] args) {
        IAreaCalculator areaCalculator = new AreaCalculator();
//        IAreaCalculator areaCalculatorV2 = new AreaCalculatorV2();

        Circle circle = new Circle(10);
        Square square = new Square(10);
        Cube cube = new Cube();
        Rectangle rectangle = new Rectangle();
//        NoShape noShape = new NoShape();

        ShapesPrinter printer = new ShapesPrinter(areaCalculator);

        List<Shape> shapes = List.of(circle, square, cube, rectangle);

        int sum = areaCalculator.sum(shapes);

        System.out.println(printer.json(shapes));
        System.out.println(printer.csv(shapes));

//        System.out.println(areaCalculator.json(shapes));
//        System.out.println(areaCalculator.csv(shapes));

        // Obeying Single Responsibility rule
//        System.out.println(printer.json(sum));
//        System.out.println(printer.csv(sum));

    }
}
