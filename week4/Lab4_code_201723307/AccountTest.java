//Fig 3.9: AccountTest.java
// inputting and outputting floating-point numbers with Account objects.
import java.util.Scanner;

public class AccountTest 
{
	public static void main(String[] args)
	{
		Account account1 = new Account("Jane Green", 50.00);
		Account account2 = new Account("John Blue", -7.53);
		
		//create a scanner to obtain input from the command window
		Scanner input = new Scanner(System.in);
		

		//display initial balance of each object
		System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());

		System.out.print("Enter deposit amount for account1:   ");	//prompt
		double depositAmount = input.nextDouble();	//obtain user input
		System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
		account1.deposit(depositAmount);		// add to account1's balance
		
		//display balances
		System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());
		
		System.out.print("Enter deposit amount for account2:   ");	//prompt
		depositAmount = input.nextDouble();	//obtain user input
		System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
		account2.deposit(depositAmount);		// add to account2's balance
		
		//display balances
		System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());	
		
		// Exercise 1-B
		Account a = new Account("AAA", 500);
		Account b = new Account("BBB", 200);

		//display 1-B balance before transfer
		System.out.print("----------------BEFORE------------------\n");	//prompt
		System.out.printf("%s balance: $%.2f%n", a.getName(), a.getBalance());
		System.out.printf("%s balance: $%.2f%n%n", b.getName(), b.getBalance());
		
		// /to check transfer function (true/false), set a bool variable 'check'
		System.out.print("now I transfer 300$ from B to A\n");
		boolean check = a.transfer(b, 300); // function call
		
		//display 1-B balance before transfer
		System.out.print("-------------------AFTER----------------\n");	//prompt
		System.out.printf("%s balance: $%.2f%n", a.getName(), a.getBalance());
		System.out.printf("%s balance: $%.2f%n%n", b.getName(), b.getBalance());
		
		// check transfer function (true/false)
		if(check==true)	System.out.print("transfer function is working well : true\n");
		else System.out.print("transfer function is NOT working : false\n");
	
		//display Exercise answer(2) 
		System.out.print("-----------------------------------------\n");
		System.out.printf("%s balance: $%.2f  number: %d%n", account1.getName(), account1.getBalance(), account1.getAccountNo());
		System.out.printf("%s balance: $%.2f  number: %d%n%n", account2.getName(), account2.getBalance(), account2.getAccountNo());
		
		input.close();
	}// end main	
}//end class AccountTest
