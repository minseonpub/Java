// Question 11
// TestOuter.java

class Outer
{
	static class StaticInner
	{
		public void M1()
		{
			System.out.println("running a method of Static inner class");
		}
	}
}

class TestOuter 
{
	public static void main(String[] args)
	{
		//write your codes
		Outer.StaticInner siner = new Outer.StaticInner();
		siner.M1();
	}
}
