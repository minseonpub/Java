// Fig. 6.10: MethodOverload.java
// Overloaded method declarations.

public class MethodOverload 
{
	//test overloaded square methods
	public static void main(String[] args)
	{
		System.out.printf("Square of integer 7 is %d%n", square(7));
		System.out.printf("Square of integer 7.5 is %f%n", square(7.5));
		System.out.printf("Square of String 'hello' is %s%n", square("hello")); 	// call from main() method 
	}
	
	// square method with integer argument 
	public static int square(int intValue)
	{
		System.out.printf("%nCalled squre with int argument: %d%n", intValue);
		return intValue * intValue;
	}
	
	// Exercise 5-B:: overloading
	/*
	public static double square(int n)
	{
		//Error 
		System.out.printf("%nCalled squre with int argument: %d%n", n);
		return n *n;
	}
	*/
	// square method with double argument
	public static double square(double doubleValue)
	{
		System.out.printf("%nCalled squre with double argument: %f%n", doubleValue);
		return doubleValue * doubleValue;
	}
	
	// square method with string argument
	public static String square(String stringVaule)
	{
		System.out.printf("%nCalled squre with double argument: %s%n", stringVaule);
		String result = stringVaule+stringVaule;
		
		return result;
	}
	
}// end class methodOverload
