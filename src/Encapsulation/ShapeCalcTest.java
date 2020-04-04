package Encapsulation;

public class ShapeCalcTest {
    public static void main(String[] args) {
        ShapeCalc.calculatePerimeter(10);
        ShapeCalc.calculatePerimeter(10.0);
        ShapeCalc.calculatePerimeter(10, 10, 10);
        ShapeCalc myShape = new ShapeCalc();
        myShape.calculateArea(10);
        myShape.calculateArea(10,10);
        myShape.calculateArea(10.0);
    }
}
