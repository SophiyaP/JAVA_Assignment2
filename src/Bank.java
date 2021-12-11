/*Create a class Bank with main() 
method and create some account objects and deposit and withdraw 
money from the account.*/
public class Bank {

	public static void main(String[] args) {
	Account obj1=new Account();
	obj1.acctBalance();
		Account obj2=new Account();
		obj2.deposit(500);
	Account obj3=new Account();
	obj3.withdraw(500);
	}

}
