// Question 9
class B 
{
	public static void main(String[] args)
	{
		A a1 = new A()// no semicolon
			{
				public void M1()
				{
					//overriding
					   System.out.println("travel by ship"); 
				}
			};//semicolon
			a1.M1();
			A a2 =new A();
			a2.M1();
	}//end of main
}// end of class
