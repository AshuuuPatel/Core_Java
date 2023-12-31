//

package JAVAAssignment;

class ParentClass {
    void printMessage() {
        System.out.println("This is a parent class");
    }
}

class ChildClass extends ParentClass {
    void printMessage() {
        System.out.println("This is a child class");
    }
}

public class task23 {
    public static void main(String[] args) {
        ParentClass parentObj = new ParentClass();
        ChildClass childObj = new ChildClass();

        parentObj.printMessage();

        childObj.printMessage();

        ((ParentClass) childObj).printMessage();
    }
}
