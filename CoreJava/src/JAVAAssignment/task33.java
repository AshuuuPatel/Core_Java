//

package JAVAAssignment;

class Shape1 {
    void printShape() {
        System.out.println("This is shape");
    }
}

class Rectangle1 extends Shape1 {
    void printShape() {
        System.out.println("This is rectangular shape");
    }
}

class Circle extends Shape1 {
    void printShape() {
        System.out.println("This is circular shape");
    }
}

class Square1 extends Rectangle1 {
    void printSquare() {
        System.out.println("Square is a rectangle");
    }
}

public class task33 {
    public static void main(String[] args) {
        Square1 square = new Square1();

        square.printShape();  
        square.printSquare(); 
    }
}
