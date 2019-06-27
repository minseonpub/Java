// Fig. 6.7: RollDie.java
// Roll a six-sided die 6,000,000 times.
import java.security.SecureRandom;
import java.util.Arrays;

public class RollDie 
{
	public static void main(String[] args)
	{
		//randomNumbers object will produce secure random numbers.
		SecureRandom randomNumbers = new SecureRandom();
		
		// Origianl: make an variable of frequency
		/* 
		int frequency1 = 0;		// count of 1s rolled
		int frequency2 = 0;		// count of 2s rolled
		int frequency3 = 0;		// count of 3s rolled
		int frequency4 = 0;		// count of 4s rolled
		int frequency5 = 0;		// count of 5s rolled
		int frequency6 = 0;		// count of 6s rolled
		*/
		
		// Exercise 6: make an array of frequency
		int[] frequency = new int[6];
		Arrays.fill(frequency,0);
			
		// tally counts for 6,000,000 rolls of a die
		for ( int roll = 1; roll <=6000000; roll++ )
		{
			int face = 1 + randomNumbers.nextInt(6);	// number from 1 to 6
			
			//use face value 1-6 to determine which counter to increment
			switch (face)
			{
				case 1:
					++frequency[0];	// increment the 1s counter
					break;
				case 2:
					++frequency[1]; 	// increment the 2s counter
					break;
				case 3:
					++frequency[2];	// increment the 3s counter
					break;
				case 4:
					++frequency[3]; 	// increment the 4s counter
					break;
				case 5:
					++frequency[4];	// increment the 5s counter
					break;
				case 6:
					++frequency[5]; 	// increment the 6s counter
					break;		
			}
		}
		System.out.println("Face\tFrequency");	//output headers

		for(int i=0;i<6;i++)
			System.out.printf(i+1+"\t%d%n",	frequency[i]);
	}
}	// end class RollDie
