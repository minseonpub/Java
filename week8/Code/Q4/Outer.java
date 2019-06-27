// Question4
// Outer.java
class Outer
{
	class Inner
	{
		public void M1()
		{
			System.out.println("Inner class method is running!");
		}
	}
	public void M2()
	{
		// write your code
		Outer outer = new Outer();
		Outer.Inner i = outer.new Inner();
		i.M1();
		
	}
	public static void main(String[] args)
	{
		// write your code
		Outer o = new Outer();
		o.M2();
	}
}
