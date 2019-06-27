// Fig. 2.7: Addition.java
// Addition program that inputs two double number then displays their sum
import java.util.Scanner;	// program uses class Scanner

public class Addition 
{
	//main method begins execution of Java application
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double number1;
		double number2;
		double sum;
		
		System.out.print("Enter first integer: ");
		number1=input.nextDouble();
		
		System.out.print("Enter second integer: ");
		number2=input.nextDouble();
		
		sum=number1+number2;
		
		System.out.printf("Sum is %.1f\n",sum);	
	}
}
