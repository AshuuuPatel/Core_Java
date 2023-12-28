//

package JAVAAssignment;

class Triangle {
    double side1;
    double side2;
    double side3;

    Triangle() {
    	
    }

    Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    void calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        System.out.println("Area of Triangle: " + area);
    }
}

public class task26 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        triangle.calculateArea();
    }
}
