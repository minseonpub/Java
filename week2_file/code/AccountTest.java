// Fig. 3.2: AccountTest.java
// Creating and manipulating an Account object.
import java.util.Scanner;


public class AccountTest
{
	public static void main(String[] args)
	{
		//create a Scanner object to obtain input from the command window
		Scanner input = new Scanner(System.in);

		//create an Account object and assign it to myAccount
		Account myAccount = new Account();

		//display initial value of name(null)
		System.out.printf("Initial name is : %s%n%n", myAccount.getName());

		//prompt for and read name
		System.out.println("Please enter the name: ");
		String theName = input.nextLine();	// read a line of test
		myAccount.setName(theName); // put theName in  myAccount
		System.out.println(); // outputs a black line

		//display the name stored in oject myAccount
		System.out.printf("Name in object myAccount is : %s%n%n", myAccount.getName());
	}
} //end class account

