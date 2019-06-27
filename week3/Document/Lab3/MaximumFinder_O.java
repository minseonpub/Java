// Fig. 6.3: MaximumFinder_O.java
// Programmer-declared method maximum with three double parameters.
import java.util.Scanner;

public class MaximumFinder_O 
{	
	// obtain three floating-point values and locate the maximum value
	public static void main(String[] args) 
	{
		// create Scanner for input from command window
		Scanner input =new Scanner(System.in);
		
		System.out.print(
				"Enter three floating-point values separated by spaces: ");
		double number1=input.nextDouble();
		double number2=input.nextDouble();
		double number3=input.nextDouble();
		
		// determine the maximum value
		double result=maximum(number1,number2,number3);
		
		//display maximum value
		System.out.println("Maximum is: "+result);
	}
	
	// returns the maximum of its three double parameters
	public static double maximum(double x, double y, double z) 
	{
		double maximumValue=x;	// assume x is the largest to start
		
		// determine whether y is greater than maximumValue
		if( y > maximumValue)
			maximumValue = y;
		
		// determine whether z is greater than maximumValue
		if( z > maximumValue)
			maximumValue = z;
		
		return maximumValue;
	}
}
