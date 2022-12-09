package moduleOne;

public class TestClass extends CheckingAccount {
	
	public static void main(String[] args) {
	CheckingAccount account = new CheckingAccount();
	System.out.println("No withdrawal or deposit: " + "\n");
	account.setfirstName("Jared");
	account.setlastName("Muir");
	account.setaccountID(565756);
	account.deposit(0);
	account.withdrawal(0);
	account.processWithdrawal();
	account.setInterestRate(0.01);
	System.out.println(account.displayAccount());
}

}
