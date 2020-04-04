package Encapsulation;

public class ShapesTest {
    public static void main(String[] args) {
        Polygon plgn = new Polygon();
        plgn.calculatePerimeter(10);
        Triangle trg = new Triangle();
        trg.calculatePerimeter(10);
        Square sqr = new Square();
        sqr.calculatePerimeter(10);
    }
}
