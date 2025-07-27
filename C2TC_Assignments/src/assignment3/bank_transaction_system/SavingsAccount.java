package assignment3.bank_transaction_system;

public class SavingsAccount extends Account{
	private static final double intrestRate = 0.03;
	
	public SavingsAccount(String name, double balance) {
		super(name, balance);
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		balance += amount + (amount * intrestRate);
		
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		if(balance >= amount) {
			balance -= amount;
		} else {
			System.out.println("Insufficient funds in SavingsAccount.");
		}
		
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}
	
	
}
