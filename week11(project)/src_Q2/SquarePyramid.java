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
			setSHeight(sh);
			try 
			{
				if(getSHeight()==0||getSHeight()<0)	throw new SHeightNPSquareException();
				else if(getSHeight()<=getHeight())   throw new SHeightSquareException();
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
		double sh=slantHeight;
		Double.parseDouble(String.format("%.1f",sh));
		return sh;
	}
	public void setSHeight(double h) 	{slantHeight=h;}
	
	//lateral area except base area
	public double getLataralArea()
	{
		return getParimeter()*getSHeight()/2;
	}
	
	public double getSurface()
	{
		double p =getParimeter();
		double sh =  getSHeight();
		double sas = getArea();
		return sas+p*sh/2;
	}
	
	public double getVolume()
	{
		double nh =  getHeight();
		double sas = getArea();
		return sas*nh/3;
	}
	
	@Override
	public String toString()
	{
		double volume2 = getVolume();
		volume2=Double.parseDouble(String.format("%.2f",volume2));
		double lateralsurface = getLataralArea();
		lateralsurface =Double.parseDouble(String.format("%.2f",lateralsurface)); 
		
		return "Type of shape: "+ getClass().getName()+ "\n" + 
				"	 coordinates of upper left vertex : "+ getUL()+ "\r\n" + 
				"	 coordinates of lower right vertex :  "+ getLR()+" \r\n" +  printSideSquare() + 
				"	 Normal Height:  "+ getHeight()+"\r\n" + 
				"	 Slant Height: "+ getSHeight()+"\r\n" +
				"	 Lateral Surface Area:  "+ lateralsurface+"\r\n" + 
				"	 Surface Area: "+  getSurface()+"\r\n" +
				"	 Volume:  "+ volume2+"\r\n";
	}
}
class SHeightNPSquareException extends Exception 	{}
class SHeightSquareException extends Exception 	{}
