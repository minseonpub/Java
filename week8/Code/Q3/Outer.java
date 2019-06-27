// Question3
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
	public static void main(String[] args)
	{
		Outer outer = new Outer();
		Outer.Inner i = outer.new Inner();
		i.M1();
	}
}
