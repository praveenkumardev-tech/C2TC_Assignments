package assignment3.bank_transaction_system;

public class BankingSystemDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount sa = new SavingsAccount("Pravven", 5000);
		CheckingAccount ca = new CheckingAccount("Antony", 10000);
		
		System.out.println("TotalAccounts: " + Bank.getTotalAccount());
		
		Transaction txn = new Transaction();
		txn.performTransaction(sa, "deposit", 2000);
		txn.performTransaction(sa, "withdraw", 1000);
		
		txn.performTransaction(ca, "deposit", 1500);
		txn.performTransaction(ca, "withdraw", 6000);
		
		sa.printAccountInfo();
		ca.printAccountInfo();

	}

}
