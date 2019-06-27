// Question 8
// Outer.java

// 로컬내부클래스의 메모리 생성시작과 소멸은 메소드의 호출과 종료에 맞김.
class Outer
{     
   private int x =10;
   private static int y = 20;
   
   public void M1( )
   {
       int z =30;
       class Inner
       { 
    	   public void M2()
    	   {
    		   System.out.println("sum: "+ (x+y+z)); 
    	   }
        
       	}
       Inner i = new Inner();	// inner class의 객체생성은 해당 클래스가 포함된 메소드에서만.
       i.M2();
       i.M2();
       i.M2();
   }// end of M1
   
   public static void main(String[] args) 
   {
	   Outer O =new Outer() ;
       O.M1();
   } 
 } // end of outer
