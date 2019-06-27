import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class GenericArrayMethod
{        
 public static void main(String args[])
  {
	// create arrays of Integer, Double and Character
    Integer[] integerArray = {1, 2, 3, 4, 5, 6};
    Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
    Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};

    System.out.print("Array integerArray before reverse\n");
    printArray(integerArray); 
    reverseArray(integerArray);
    System.out.print("Array integerArray after reverse\n");
    printArray(integerArray); 
    
    System.out.print("Array doubleArray before reverse\n");
    printArray(doubleArray);  
    reverseArray(doubleArray);
    System.out.print("Array doubleArray after reverse\n");
    printArray(doubleArray); 
    
    System.out.print("Array characterArray before reverse\n");
    printArray(characterArray);  
    reverseArray(characterArray);
    System.out.print("Array characterArray after reverse\n");
    printArray(characterArray); 
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


//generic method reverses array 
 public static <T> void reverseArray(T[] arr)
 { 
	// write the blank spaces
	 for(T element : arr )
	 {
		 T temp;
         
	        for (int i = 0; i < arr.length/2; i++) 
	        {
	            temp = arr[i];
	             
	            arr[i] = arr[arr.length-1-i];
	             
	            arr[arr.length-1-i] = temp;
	        }
	 }
 }
} // end class GenericMethodTest
	


