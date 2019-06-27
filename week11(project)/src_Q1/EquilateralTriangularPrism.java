import java.util.Scanner;

public class EquilateralTriangularPrism extends EquilateralTriangle
{
	private double height;
	
	EquilateralTriangularPrism()
	{
		Scanner scan = new Scanner(System.in);
		double h;
		System.out.print("Please enter normal height: ");
		while(true)
		{
			h = scan.nextDouble();
			this.setHeight(h);
			try 
			{
				if(this.getHeight()==0||this.getHeight()<0)	throw new HeightNPTriangleException();
			}
			catch(HeightNPTriangleException heightexception)
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
	
	//lateral surface include base area
	public double getSurfaceArea()
	{
		double p = super.getParimeter()*2;
		double nh =  this.getHeight();
		double sat = super.getArea();
		return sat*2+ p*nh;
	}
	
	public double getVolume()
	{
		double nh = this.getHeight();
		double sat = super.getArea();
		return sat*nh;
	}

	public String toString()
	{
		double distance1 = getDistance(this.getV1(), this.getV2());
		double distance2 = getDistance(this.getV2(), this.getV3());
		double distance3 = getDistance(this.getV2(), this.getV3());
		distance1 = Double.parseDouble(String.format("%.1f",distance1));
		distance2 = Double.parseDouble(String.format("%.1f",distance2));
		distance3 = Double.parseDouble(String.format("%.1f",distance3));
		double surfaceArea1 =  this.getSurfaceArea();
		surfaceArea1 = Double.parseDouble(String.format("%.1f",surfaceArea1));
		double volume1 = this.getVolume();
		volume1=Double.parseDouble(String.format("%.1f",volume1));
		
		return "Type of shape:" + this.getClass().getName()+ "\n" + 
				"	 Coordinates of Vertex One: "+ this.getV1()+ "\n" + 
				"	 Coordinates of Vertex Two: "+ this.getV2()+" \n" + 
				"	 Coordinates of Vertex Three: "+ this.getV3()+" \n" + 
				"	 getDistance of side 1: "+ distance1 +"\n" + 
				"	 getDistance of side 2: "+ distance2 +"\n" +
				"	 getDistance of side 3: "+ distance3 +"\n" +
				"	 Normal Height: "+ this.getHeight()+"\n" +
				"	 Surface Area: "+ surfaceArea1+"\n"+
				"	 Volume:  "+ volume1 +"\n" ;
	}
}
class HeightNPTriangleException extends Exception 	{}