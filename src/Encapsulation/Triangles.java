package Encapsulation;

public class Triangles implements Polygons {
    public void calculatePerimeter(int edge){
        System.out.println("Perimeter of Triangle: " + (edge *3));
    }
}
