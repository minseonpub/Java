import java.util.Scanner;

public class SquarePrism extends Square
{
	private double height;
	
	SquarePrism()
	{
		Scanner scan = new Scanner(System.in);
		double h;
		System.out.print("Please input value for height: ");
		while(true)
		{
			h = scan.nextDouble();
			setHeight_prism(h);
			try 
			{
				if(getHeight()==0||getHeight()<0)	throw new HeightNPSquareException();
			}
			catch(HeightNPSquareException heightexception)
			{
				System.err.println("\nError: Normal height should be positive.\n");
				System.out.print("Please input positive value for height: ");
				continue;
			}
			break;
		}
	}

	public void setHeight_prism(double g)
	{
		height=g;
	}
	
	public double getHeight() 
	{
		double h=height;
		Double.parseDouble(String.format("%.1f",h));
		return h;
	}
	//lataral surface except base area
	public double getLataralArea()
	{
		double p = getParimeter();
		double nh = getHeight();

		return p*nh;
	}
	
	// lataral surface include base area
	public double getSurface()
	{
		double sas = getArea();
		return 2*sas + getLataralArea();
	}

	public double getVolume()
	{
		double nh =  getHeight();
		double sas = getArea();
		return sas*nh;
	}
	
	public String toString()
	{
		double area = getSurface();
		area=Double.parseDouble(String.format("%.2f",area));
		double volume = getVolume();
		volume=Double.parseDouble(String.format("%.1f",volume));
		double lateralsurface = getLataralArea();
		lateralsurface =Double.parseDouble(String.format("%.1f",lateralsurface)); 
		
		return "Type of shape: Square  \r\n" + 
				"	 coordinates of upper left vertex : "+ getUL()+ "\r\n" + 
				"	 coordinates of lower right vertex :  "+ getLR()+" \r\n" +  printSideSquare() + 
				"	 Normal Height:  "+ getHeight()+"\r\n" + 
				"	 Lateral Surface Area:  "+ lateralsurface+"\r\n" + 
				"	 Surface Area: "+ area+"\r\n" +
				"	 Volume:  "+ volume+"\r\n";
	}
}
class HeightNPSquareException extends Exception 	{}