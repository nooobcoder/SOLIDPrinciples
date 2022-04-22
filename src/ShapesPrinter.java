import java.util.List;

public class ShapesPrinter {

    private final IAreaCalculator areaCalculator;

    // Dependency injection 💉
    public ShapesPrinter(IAreaCalculator areaCalculator) {
        this.areaCalculator = areaCalculator;
    }

    public String json(List<Shape> shapes) {
        return "{shapesSum: %s}".formatted(areaCalculator.sum(shapes));
    }

    public String csv(List<Shape> shapes) {
        return "shapes_sum, %s".formatted(areaCalculator.sum(shapes));
    }
}
