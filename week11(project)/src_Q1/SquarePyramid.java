import java.util.Scanner;

public class SquarePyramid extends SquarePrism
{
	private double slantHeight;
	
	public SquarePyramid() 
	{
		// TODO Auto-generated constructor stub
		Scanner scan = new Scanner(System.in);
		double sh;

		System.out.print("Please enter slant height: ");
		while(true)
		{
			sh = scan.nextDouble();
			this.setSHeight(sh);
			try 
			{
				if(this.getSHeight()==0||this.getSHeight()<0)	throw new SHeightNPSquareException();
				else if(this.getSHeight()<=super.getHeight())   throw new SHeightSquareException();
			}
			catch(SHeightNPSquareException sheightNPexception)
			{
				System.err.println("\nError: Slant height should be positive.\n");
				System.out.print("Please input correct Slant Height: ");
				continue;
			}
			catch(SHeightSquareException sheightexception)
			{
				System.err.println("\nError: Slant Height should be larger than normal Height. \n");
				System.out.print("Please input correct Slant Height: ");
				continue;
			}
			break;
		}
	}
	
	public double getSHeight() 
	{
		double sh=this.slantHeight;
		Double.parseDouble(String.format("%.1f",sh));
		return sh;
	}
	public void setSHeight(double h) 	{this.slantHeight=h;}
	
	//lateral area except base area
	public double getLataralArea()
	{
		return super.getParimeter()*this.getSHeight()/2;
	}
	
	public double getSurface()
	{
		double p =super.getParimeter();
		double sh =  this.getSHeight();
		double sas = super.getArea();
		return sas+p*sh/2;
	}
	
	public double getVolume()
	{
		double nh =  super.getHeight();
		double sas = super.getArea();
		return sas*nh/3;
	}
	
	@Override
	public String toString()
	{
		double volume2 = this.getVolume();
		volume2=Double.parseDouble(String.format("%.2f",volume2));
		double lateralsurface = this.getLataralArea();
		lateralsurface =Double.parseDouble(String.format("%.2f",lateralsurface)); 
		
		return "Type of shape: "+ this.getClass().getName()+ "\n" + 
				"	 coordinates of upper left vertex : "+ this.getUL()+ "\r\n" + 
				"	 coordinates of lower right vertex :  "+ this.getLR()+" \r\n" +  super.printSideSquare() + 
				"	 Normal Height:  "+ this.getHeight()+"\r\n" + 
				"	 Slant Height: "+ this.getSHeight()+"\r\n" +
				"	 Lateral Surface Area:  "+ lateralsurface+"\r\n" + 
				"	 Surface Area: "+  this.getSurface()+"\r\n" +
				"	 Volume:  "+ volume2+"\r\n";
	}
}
class SHeightNPSquareException extends Exception 	{}
class SHeightSquareException extends Exception 	{}
