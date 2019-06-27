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
			this.setHeight(h);
			try 
			{
				if(this.getHeight()==0||this.getHeight()<0)	throw new HeightNPSquareException();
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

	public void setHeight(double g)
	{
		this.height=g;
	}
	
	public double getHeight() 
	{
		double h=this.height;
		Double.parseDouble(String.format("%.1f",h));
		return h;
	}
	//lataral surface except base area
	public double getLataralArea()
	{
		double p = super.getParimeter();
		double nh = this.getHeight();

		return p*nh;
	}
	
	// lataral surface include base area
	public double getSurface()
	{
		double sas = super.getArea();
		return 2*sas + this.getLataralArea();
	}

	public double getVolume()
	{
		double nh =  this.getHeight();
		double sas = super.getArea();
		return sas*nh;
	}
	
	public String toString()
	{
		double area = this.getSurface();
		area=Double.parseDouble(String.format("%.2f",area));
		double volume = this.getVolume();
		volume=Double.parseDouble(String.format("%.1f",volume));
		double lateralsurface = this.getLataralArea();
		lateralsurface =Double.parseDouble(String.format("%.1f",lateralsurface)); 
		
		return "Type of shape: Square  \r\n" + 
				"	 coordinates of upper left vertex : "+ this.getUL()+ "\r\n" + 
				"	 coordinates of lower right vertex :  "+ this.getLR()+" \r\n" +  super.printSideSquare() + 
				"	 Normal Height:  "+ this.getHeight()+"\r\n" + 
				"	 Lateral Surface Area:  "+ lateralsurface+"\r\n" + 
				"	 Surface Area: "+ area+"\r\n" +
				"	 Volume:  "+ volume+"\r\n";
	}
}
class HeightNPSquareException extends Exception 	{}