// GenericMethodTest.java
// Overloading generic methods.

public class GenericMethodTest 
{
   public static void main(String[] args) 
   {
      // create arrays of Integer, Double and Character
      Integer[] integerArray = {1, 2, 3, 4, 5};
      Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
      Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};
      String[] stringArray = {"one", "two", "three", "four", 
         "five", "six", "seven", "eight"};

      System.out.println("Array integerArray contains:");
      printArray(integerArray); // call generic with an Integer array

      System.out.println("\nArray doubleArray contains:");
      printArray(doubleArray); // call generic with a Double array

      System.out.println("\nArray characterArray contains:");
      printArray(characterArray); // call generic with a Character array

      System.out.println("\nArray stringArray contains:");
      printArray(stringArray); // method specific to string arrays
   }
   
 //generic method printArray
   public static <T> void printArray(T[] arr)
   {
  	// fill the blank spaces
  	 for(T element : arr )
  	 {
  		 System.out.printf("%s ", element);
  	 }
  	 System.out.println();
   }// end method


   // method that prints array of strings in tabular format
   public static void printArray(String[] arr)// fill the blank space
   {
      //  write code to display elements of array
     for(int i=0; i<arr.length; i++)
     {
    	 if(i%4==0&&i!=0)	 System.out.printf("\n");
    	 System.out.printf("%s	", arr[i]);
     }

   } 
} // end class GenericMethodTest


