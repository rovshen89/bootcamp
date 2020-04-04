package Encapsulation;

public class ShapeCalc {
    public static void calculatePerimeter(int edge1, int edge2, int edge3){
        System.out.println("Perimeter of Triangle: " + edge1+edge2+edge3);
    }

    public static void calculatePerimeter(int edge){
        System.out.println("Perimeter of the Square: " + (4 * edge));
    }

    public static void calculatePerimeter(double radius){
        System.out.println("Perimeter of the Circle: " + (2* 22/7 * radius));
    }

    public void calculateArea(int a, int b){
        System.out.println("Area of the rectangle: " + (a * b));
    }

    public void calculateArea(int edge){
        System.out.println("Area of the square: " + (edge * edge));
    }

    public void calculateArea(double radius){
        System.out.println("Area of the circle: " + (2*22/7 *radius * radius));
    }

}
