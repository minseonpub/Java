// Test.java
import java.util.*;
public class Test 
{
	// program_Quesiton4:
	int i;
	
	public Test(int i)
	{
		this.i = i;
	}
	public int hashCode()
	{
		return i;
	}

	public String toString()
	{
		return hashCode() + " ";
	}
	
	public static void main(String[] main)
	{
		Test t1 = new Test(10);
		Test t2 = new Test (100);
		System.out.println(t1);
		System.out.println(t2);
	}
	
	/*// normal Test. java 's main
	public static void main(String[] main)
	{
		String s = new String("Kim");	//built-in String class
		System.out.println(s);
		
		Integer i = new Integer(10);	// built-in wrapper class
		System.out.println(i);
		
		ArrayList L = new ArrayList();	// built-in collection class
		L.add("A");
		L.add("B");
		System.out.println(L);
		
		Test t = new Test(); 	// user defined class
		System.out.println(t);
	}*/
}// end of class
