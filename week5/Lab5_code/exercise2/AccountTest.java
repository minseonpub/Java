 //Fig 3.9: AccountTest.java
// inputting and outputting floating-point numbers with Account objects.
import java.util.Scanner;

public class AccountTest 
{
	public static void main(String[] args)
	{
		Account account1 = new Account("Jane Green", 50.00);
		Account account2 = new Account("Hong kil-Dong");
		
		//display initial balance of each object
		System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());
	
		//create a scanner to obtain input from the command window
		Scanner input = new Scanner(System.in);
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
					
		input.close();
	}// end main	
}//end class AccountTest
