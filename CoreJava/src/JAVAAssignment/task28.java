//

package JAVAAssignment;

abstract class Parent {
    abstract void message();
}

class FirstSubclass extends Parent {
    void message() {
        System.out.println("This is first subclass");
    }
}

class SecondSubclass extends Parent {
    void message() {
        System.out.println("This is second subclass");
    }
}

public class task28 {
    public static void main(String[] args) {
        Parent firstSubclassObj = new FirstSubclass();
        Parent secondSubclassObj = new SecondSubclass();

        firstSubclassObj.message();
        secondSubclassObj.message();
    }
}
