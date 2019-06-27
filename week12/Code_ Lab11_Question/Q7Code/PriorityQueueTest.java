//  PriorityQueueTest.java
// Order PriorityQueue with a Comparator.
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueTest
{
   public static void main(String[] args)
   {
      // queue of capacity 5 and a new Comparator
      PriorityQueue<Double> queue =
         new PriorityQueue<Double>(5, new DoubleComparator());

      // insert elements to queue
      queue.offer(3.2);
      queue.offer(9.8);
      queue.offer(5.4);

      System.out.print("Polling from queue: ");

      while (queue.size()> 0)
      {   
    	 /*  fill the following blank lines to view top element and
    	  *  to  remove to element. You can refre methods of PriorityQueue class
    	  *  from java API
    	  */
         System.out.printf("%.1f ", queue.peek()); // view top element
         queue.poll(); // remove top element
      } 
   } 

   private static class DoubleComparator implements Comparator<Double>
   {
      // complete the code of the following method by filling the blank space  
	       public int compare(Double first, Double second)
	      {
	        // fill the missing line.
	    	 if(first<second)	return 1;
	    	 if(first>second)	return -1;
	    	 
	    	 return 0;
	      }     
   } 
} // end class PriorityQueueTest

