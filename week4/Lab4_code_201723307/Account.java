// Fig. 3.8 : Account.java
// Account class with a double instance variable balance and a constructor 
// and deposit method that perform validation

public class Account 
{
	private String name;		// instance variable
	private double balance;		// instance variable
	
	private int accountNo; // Account number
	private static int no = 1000; // Variable to creating account numbers sequentially such as //1001, 1002, 1003, 104,105,106,...
	
	// method that transfer money and check what the money is transferred normally or not
	boolean transfer(Account b, double amt)
	{
		//StackTraceElement[] stacks = new Throwable().getStackTrace();
		//StackTraceElement currentStack = stacks[0];
		if(b.balance >= amt)
		{
			b.balance=b.balance-amt;
			this.balance=this.balance+amt;
			return true;
		}
		else
		{
			System.out.print("Account does not have enough amount!\n");
			return false;
		}
	}
	
	//Account constructor that receives two parameters
	public Account(String name, double balance)		//constructor
	{
		this.name = name;		// assign name to instance variable name
		
		// validate that the balance is greater than 0.0: if it's not.
		// instance variable balance keeps its default initial value of 0.0
		if (balance > 0.0)	// if the balance is valid
			this.balance = balance;	// assign it to instance variable balance
		accountNo = getNo();	// Initialize account number
	}
	
	private int getNo()
	{
		return ++no;
	} // added method to create account number.
	
	public int getAccountNo()
	{
		return accountNo;
	}// added method to know account number.
	
	
	//method that deposits (adds) only a valid amount to the balance
	public void deposit (double depositAmount)
	{
		if (depositAmount > 0.0)				// if the depositAmount is valid
			balance = balance + depositAmount;	// add it to the balance
	}
	
	// method returns the account balance
	public double getBalance()
	{
		return balance;
	}
	
	// method that sets the name
	public void setName(String name)
	{
		this.name=name;
	}
	
	// method that returns the name
	public String getName()
	{
		return name;	// give value of name back to caller
	}// end method getName
	
} // end class Account
