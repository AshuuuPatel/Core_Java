//

package JAVAAssignment;

class Rectangle {
    double length;
    double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void calculateArea() {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }

    void calculatePerimeter() {
        System.out.println("Perimeter of Rectangle: " + (2 * (length + breadth)));
    }
}

class Square extends Rectangle {
    Square(double side) {
        super(side, side);
    }
}

public class task25 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 8);
        Square square = new Square(4);

        rectangle.calculateArea();
        rectangle.calculatePerimeter();

        square.calculateArea();
        square.calculatePerimeter();
    }
}
