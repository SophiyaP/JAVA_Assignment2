/*Create a class Account with following attributes – account number, 
name, balance. Write constructor to initialize Account objects. Write 
methods to get account balance, deposit money and withdraw 
money from the account. The amount of money to be deposited or 
withdrawn should be passed as parameters.(Tip: Check balance 
before withdrawing the money.).Create a class Bank with main() 
method and create some account objects and deposit and withdraw 
money from the account.*/
public class Account {
	
	private  int accountNo;
	private String name;
	private double balance;
	private double depositmoney;
	private double withdrawmoney;
	private double actbalance;
	
	public Account() {
		accountNo=12345678;
		name="Sundar";
		balance=56000;
	//	depositmoney=1500;
		//		withdrawmoney=1000;
		}

	public void acctBalance() {
	//balance=x;
		System.out.println("Account Details ::");
	System.out.println("Account Name :: " +name);
	System.out.println("Account Number::"+accountNo);
	System.out.println("Current Balance $" +balance);
	}
	public void deposit(double y) {
		depositmoney=y;
	System.out.println("The Deposited money ::$"  +depositmoney);
	double acctBalance=balance+y;
	System.out.println("The balance after money deposit is $ "  +acctBalance);
	}
	public void withdraw(double d) {
		withdrawmoney=d;
		if(d<balance)  // 100<56500
		{
			System.out.println("Withdrawal amount is  $"  +d);
		double balance2=balance-d;
			System.out.println("Balance after money withdrawal of $ " +d +" is $"+balance2);
		}
		else
		{
			System.out.println("Sorry!!Low balance.Cannot withdraw money" );
System.out.println("Your withdrawal amount is $"  +d 	
		+"which is more than your account balance  $"  +balance);
		}
	}
}
