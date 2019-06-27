// ObjectTest.java
import java.lang.reflect.*;
public class ObjectTest 
{
	public static void main(String []args) throws Exception
	{
		int count = 0; 
		Class<?> c = Class.forName("java.lang.object");
		Method[] m = c.getDeclaredMethods();
		for (Method mi : m)	// java.lang.reflect.Method
		{
			System.out.println(mi.getName());
			count++;
		}
		System.out.println("the number of method: "+count);
	}//end of main
}//end of class