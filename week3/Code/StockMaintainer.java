// Program Lab3: StockMaintainer
// Maintain and purchasing program has a unique identification number from 1 to 10.

import java.util.Scanner;
import java.util.Arrays;;			//for Arrays.fill

public class StockMaintainer 
{
	static int totalPrice;	// declare variable about total price
	
	static int ch_num;		// declare variable about menu number
	static int pur_num;	// declare variable about purchasing number
	static int CheckEx;	// declare variable about Exit or Continue
	
	// make a menu string from 1 to 10
	static String[] menu =  new String[10]; 	// declare menu array

	static int[] price = new int[10]; 			// declare price array
	static int[] stock = new int[10];			// declare stock array
	
	public static void main(String[] args)
	{
		// create Scanner for input from command window
		Scanner input = new Scanner(System.in);

		// variable initialization in Menu array
		menu[0] = "Esspresso\t";
		menu[1] = "Caffe Americano";
		menu[2] = "Caffe Latte\t";
		menu[3] = "Cappuccino\t";
		menu[4] = "Flat White\t";
		menu[5] = "Vienna\t";
		menu[6] = "Affogato\t";
		menu[7] = "Iced Tea\t";
		menu[8] = "Club Sandwich";
		menu[9] = "Cream-cheese Bagel";	
		
		// variable initialization in price array 
		price[0] = 3;	price[1] = 4;	price[2] = 5;	price[3] = 5;	price[4] = 6;
		price[5] = 6;	price[6] = 7;	price[7] = 4;	price[8] = 7;	price[9] = 6;
		
		// variable initialization in stock array
		// maximum stock : 10
		Arrays.fill(stock,10);
	
		System.out.println("*****************Welcome to AJOU Cafe.*****************");
		System.out.println("**************************Menu*************************");
		
		while(true) {
			ViewinStock(menu, price);							// view Menu on screen
			System.out.print("\nPlease choose menu!  Numer :  ");
			ch_num=input.nextInt();
			
			System.out.print("Please enter count!  Count :  ");
			pur_num = input.nextInt();
			line();
			
			if (purchase_item(menu, price, stock, ch_num, pur_num)==false) continue;	
			
			// select either exit or continue
			System.out.print("Do you have another order? (Exit:-1, Else number: Continue) :  ");
			CheckEx = input.nextInt();
			
			if(CheckEx==-1)	break; 		// check Exit or not
			else continue;
	
		} // end of entire while loop
		
		System.out.println("\n\n\r\n" + 
				"The total amount you need to pay is $"+totalPrice);
		
		input.close();		// to close scanner
	}// end of main method
	
	
	//View the unit price of a product
	public static void ViewinStock(String[] menu, int[] price)	
	{
		for(int i=0;i<10;i++ )
			System.out.println("["+(i+1)+"]"+menu[i]+"\t$"+price[i]);
	
	} //end of ViewinStock method
	
	
	// Add an item to the information system when a product is purchased
	// check stock amount
	public static boolean purchase_item(String[] menu, int[] price, int[] stock, int ch_num, int pur_num)
	{
		boolean TF=true;
		stock[ch_num-1] -= pur_num;
		
		if (stock[ch_num-1]<0)	
		{
			System.out.println("\nThe menu is out of stock!");
			System.out.println("Please order again within offering stock");	line();
			stock[ch_num-1] += pur_num;
			TF=false;
			return TF;		//return function error
		}
		
		System.out.println("Until now, Your order list");
		calTotal(menu, price, ch_num, pur_num);
		return TF;
	}//end of purchase_item method
	
	
	// calculate Total price and print
	public static void calTotal(String[] menu, int[] price, int ch_num, int pur_num)
	{
		System.out.println("Current Selcting Menu: "+menu[ch_num-1]+"  count:  "+pur_num);
		System.out.println("Current menu price: $"+price[ch_num-1]*pur_num);
		
		totalPrice += price[ch_num-1]*pur_num; 
		System.out.println("Total price: $"+totalPrice);
		line();
	}//end of calTotal method
				
	// just for view
	public static void line()
	{
		System.out.println("\n*******************************************************");
	}	
}
