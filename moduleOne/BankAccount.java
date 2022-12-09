


//BankAccount is the super class for this program
public class BankAccount {

//start of fields needed for bank accounts
	String firstName;
	String lastName;
	int accountID;
	private double balance;
	
	public BankAccount() {
		setBalance(0);
	}
	
public double setBalance(double balanceOne) {
	return balance = balanceOne;	
	}

	//start of set and get methods for first/last name and accountID	
	public void setfirstName(String fName) {
		firstName = fName;
	}
	
	public void setlastName(String lName) {
		lastName = lName;
	}
	
	public void setaccountID(int acctID) {
		accountID = acctID;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getAccountID() {
		return accountID;
	}
//end of set and get methods for first/last name and accountID	
	
//get method for balance
	public double getBalance() {
		return balance;
	}
	
//method to deposit into bank account
	public double deposit(double amount) {
		setBalance(getBalance() + amount);
		return getBalance();
	}
	
//method to withdrawal from bank account
	public double withdrawal(double amount) {
		setBalance(getBalance() - amount);
		return getBalance();
	}
	
//method to return all account information
	public String accountSummary() {
		return "First Name: " + getFirstName() + "\n" + "Last Name: "
				+ getLastName() + "\n" + "Account ID: " + getAccountID() +
				"\n" + "Balance: " + getBalance();
	}
}
