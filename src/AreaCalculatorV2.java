import java.util.List;

public class AreaCalculatorV2 implements IAreaCalculator {

    @Override
    public int sum(List<Shape> shapes) {
        int sum = 0;
        for (Shape shape : shapes) {
            // Using interface and implementing it in the classes to respect the open-closed principle
            sum += shape.area();
        }
        return sum;
    }

    // Below functions destroy the Single Responsibility rule, as the class does not serve one purpose, it instead is a multi
    // featured class
/*
    public String json(List<Object> shapes) {
        return "{sum: %s}".formatted(sum(shapes));
    }
    public String csv(List<Object> shapes) {
        return "sum, %s".formatted(sum(shapes));
    }
*/
}
