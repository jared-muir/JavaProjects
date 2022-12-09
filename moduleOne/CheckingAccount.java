package moduleOne;

public class CheckingAccount extends BankAccount {
	
	double interestRate = 0;
	double amount = 0;
	
//this method will process a $30 fee if account drops below zero then sends message
	
// PROBLEM: code did not accept withdrawal from BankAccount as parameter for processWithdrawl
//FIXED: added withdrawal to process withdrawal to display message under checking account class
	public void processWithdrawal() {
		withdrawal(amount);
		if (getBalance() < 0) {
			setBalance(getBalance() - 30);
			System.out.println("You have been charged a $30 overdraft fee");
		}
	}

//set rate for any given checking account	
	public void setInterestRate(double rate) {
		interestRate = rate;
		if ((rate > 0) & (getBalance() > 0)) {
			double accumulatedInterest = 0;
			accumulatedInterest = getBalance() * rate;
			setBalance(getBalance() + accumulatedInterest);
		}
	}

//calculate and return balance with interest rate included	
	public double getInterestRate() {
		return interestRate;
	}

	public String displayAccount() {
		return "First Name: " + getFirstName() + "\n" + "Last Name: "
				+ getLastName() + "\n" + "Account ID: " + getAccountID() +
				"\n" + "Balance: " + getBalance() + "\n" +
				"Account Interest Rate: " + getInterestRate();
	}	
}
