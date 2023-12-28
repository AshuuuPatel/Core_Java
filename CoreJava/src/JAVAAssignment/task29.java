//

package JAVAAssignment;

abstract class Bank {
    abstract void getBalance();
}

class BankA extends Bank {
    void getBalance() {
        System.out.println("$100 deposited in Bank A");
    }
}

class BankB extends Bank {
    void getBalance() {
        System.out.println("$150 deposited in Bank B");
    }
}

class BankC extends Bank {
    void getBalance() {
        System.out.println("$200 deposited in Bank C");
    }
}

public class task29 {
    public static void main(String[] args) {
        BankA bankA = new BankA();
        BankB bankB = new BankB();
        BankC bankC = new BankC();

        bankA.getBalance();
        bankB.getBalance();
        bankC.getBalance();
    }
}
