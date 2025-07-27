package assignment3.bank_transaction_system;

public class CheckingAccount extends Account{
	
	public CheckingAccount(String name, double balance) {
		super(name, balance);
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		balance += amount;
		
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		if(balance >= amount) {
			balance -= amount;
		} else {
			System.out.println("Insufficient funds in CheckingAccount.");
		}
		
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}
	
	
}
