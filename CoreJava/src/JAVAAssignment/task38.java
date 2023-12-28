//

package JAVAAssignment;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class Account {
    int balance = 2000;

    void withdraw(int amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Sorry, insufficient balance. You need more " + (amount - balance) + " Rs.");
        } else {
            balance -= amount;
            System.out.println("Amount withdrawn successfully. Remaining balance: " + balance);
        }
    }
}

public class task38 {
    public static void main(String[] args) {
        try {
            Account account = new Account();
            System.out.print("Enter withdrawal amount: ");
            int withdrawalAmount = Integer.parseInt(args[0]); 
            account.withdraw(withdrawalAmount);
        } catch (InsufficientBalanceException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
