package assignment6;

//Custom Exception: Thrown when the deposit or withdrawal amount is invalid
class InvalidAmountException extends Exception {
 public InvalidAmountException(String message) {
     super(message);
 }
}

//Custom Exception: Thrown when withdrawal amount exceeds balance
class InsufficientFundsException extends Exception {
 public InsufficientFundsException(String message) {
     super(message);
 }
}

//Class representing a simple bank account
class BankAccount {
 private int accountNumber;
 private double balance;

 // Parameterized constructor to initialize account
 public BankAccount(int accountNumber, double balance) {
     this.accountNumber = accountNumber;
     this.balance = balance;
 }

 // Method to deposit money
 // Throws InvalidAmountException for negative or zero amount
 public void deposit(double amount) throws InvalidAmountException {
     if (amount <= 0) {
         throw new InvalidAmountException("Deposit amount must be greater than 0.");
     }
     balance += amount;
     System.out.println("Deposited ₹" + amount + " successfully.");
 }

 // Method to withdraw money
 // Throws InvalidAmountException or InsufficientFundsException
 public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException {
     if (amount <= 0) {
         throw new InvalidAmountException("Withdrawal amount must be greater than 0.");
     }
     if (amount > balance) {
         throw new InsufficientFundsException("Insufficient balance. Available: ₹" + balance);
     }
     balance -= amount;
     System.out.println("Withdrew ₹" + amount + " successfully.");
 }

 // Method to display current balance
 public void displayBalance() {
     System.out.println("Account No: " + accountNumber + " | Current Balance: ₹" + balance);
 }
}

//Main class demonstrating the banking system
public class BankingApp {
 public static void main(String[] args) {
     // Creating a bank account instance with initial balance
     BankAccount account = new BankAccount(1001001, 5000.0);

     // First transaction - Deposit and Withdraw
     try {
         account.deposit(2000);         // Valid deposit
         account.withdraw(1000);        // Valid withdrawal
     } catch (InvalidAmountException | InsufficientFundsException e) {
         System.out.println("Error: " + e.getMessage());
     } finally {
         account.displayBalance();      // Always display balance
     }

     // Second transaction - Invalid deposit
     try {
         account.deposit(-500);         // Invalid deposit
     } catch (InvalidAmountException e) {
         System.out.println("Error: " + e.getMessage());
     } finally {
         account.displayBalance();
     }

     // Third transaction - Withdraw more than balance
     try {
         account.withdraw(10000);       // Insufficient funds
     } catch (InvalidAmountException | InsufficientFundsException e) {
         System.out.println("Error: " + e.getMessage());
     } finally {
         account.displayBalance();
     }
 }
}



