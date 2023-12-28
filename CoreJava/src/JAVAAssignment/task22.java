//

package JAVAAssignment;

class Shape {
    void calculateArea(int length, int breadth) {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }

    void calculateArea(int side) {
        System.out.println("Area of Square: " + (side * side));
    }
}

public class task22 {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.calculateArea(5, 8); 
        shape.calculateArea(4);    
    }
}
