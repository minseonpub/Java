// Question 7
// Outer.java

class Outer
{     
   int x =10;
   class Inner
   { 
       int x=20;
             
       public void M1( )
       {
           int x =30;
           System.out.println(x);
           System.out.println(this.x);
           System.out.println(Outer.this.x);
       }
   	}          
       public static void main(String[] args) 
       {
    	   Outer O =new Outer() ;
           Outer.Inner i  = O. new Inner() ;
           i.M1();
       } 
 } // end of outer
