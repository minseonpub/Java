// Question 8
// Outer.java

// ���ó���Ŭ������ �޸� �������۰� �Ҹ��� �޼ҵ��� ȣ��� ���ῡ �±�.
class Outer
{     
	static class StaticInner
	{
		public void M1()
		{
			System.out.println("running a method of Static inner class");
		}
	}
	public static void main(String[] args)
	{
		//write your code
		
		Outer.StaticInner a = new Outer.StaticInner();
		a.M1();
	}
 } // end of outer
