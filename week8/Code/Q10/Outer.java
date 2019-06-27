// Question 8
// Outer.java

// 로컬내부클래스의 메모리 생성시작과 소멸은 메소드의 호출과 종료에 맞김.
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
