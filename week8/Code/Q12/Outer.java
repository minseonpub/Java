// Question 12
// Outer.java
class Outer 
{
	static class StaticInner
	{
		public static void main(String[] args)
		{
			System.out.println("main method of Static inner class is running");
		}
	}
	public static void main(String[] args)
	{
		System.out.println("main method of outer class is running");
	}
}//end of outer class
