// Fig. 6.3: MaximumFider.java
// Programmer-declared method maximum with three double parameters.
import java.util.Scanner;

public class MaximumFinder 
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
		double result = maximum(number1,number2,number3);
		System.out.println("Maximum is: "+result);
		
		// print result of average method rounded up to the second digit(%.2f) 
		double result_avg = average(number1,number2,number3);
		System.out.format("Average is: %.2f\n",result_avg);
	
	}
	public static double maximum(double x, double y, double z) 
	{
		double maximumValue = x;
		
		// determine whether y is greater than maximumValue
		if( y > maximumValue )
		maximumValue = y;
	
		// determine whether z is greater than maximumValue
		if( z > maximumValue )
			maximumValue = z;
	
		return maximumValue;
	}
	public static double average(double x, double y, double z) 
	{
		// declare new variable named "average" and make a equation
		double average = (x+y+z)/3;
		
		return average;
	}

	
}
