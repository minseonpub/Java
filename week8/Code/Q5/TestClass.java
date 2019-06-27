// Question5
// TestClass.java
class Outer
{
	
	class Inner
	{
		public void M1()
		{
			System.out.println("Inner class method is running!");
		}
	}
}

class TestClass
{
	public static void main(String[] args)
	{
		// write your code
		Outer o = new Outer();
		Outer.Inner inner = o.new Inner();
		inner.M1();
	}
}
