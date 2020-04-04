package Encapsulation;

public class Squares implements Polygons {
    public void calculatePerimeter(int edge){
        System.out.println("Perimeter of the square: " + (edge * 4));
    }
}
