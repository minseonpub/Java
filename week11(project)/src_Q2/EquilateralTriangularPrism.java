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
			setHeight(h);
			try 
			{
				if(getHeight()==0||getHeight()<0)	throw new HeightNPTriangleException();
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
		height=g;
	}
	public double getHeight() 
	{
		double h=height;
		Double.parseDouble(String.format("%.1f",h));
		return h;
	}
	
	//lateral surface include base area
	public double getSurfaceArea()
	{
		double p = getParimeter()*2;
		double nh =  getHeight();
		double sat = getArea();
		return sat*2+ p*nh;
	}
	
	public double getVolume()
	{
		double nh = getHeight();
		double sat = getArea();
		return sat*nh;
	}

	public String toString()
	{
		double distance1 = getDistance(getV1(), getV2());
		double distance2 = getDistance(getV2(), getV3());
		double distance3 = getDistance(getV2(), getV3());
		distance1 = Double.parseDouble(String.format("%.1f",distance1));
		distance2 = Double.parseDouble(String.format("%.1f",distance2));
		distance3 = Double.parseDouble(String.format("%.1f",distance3));
		double surfaceArea1 =  getSurfaceArea();
		surfaceArea1 = Double.parseDouble(String.format("%.1f",surfaceArea1));
		double volume1 = getVolume();
		volume1=Double.parseDouble(String.format("%.1f",volume1));
		
		return "Type of shape:" + getClass().getName()+ "\n" + 
				"	 Coordinates of Vertex One: "+ getV1()+ "\n" + 
				"	 Coordinates of Vertex Two: "+ getV2()+" \n" + 
				"	 Coordinates of Vertex Three: "+ getV3()+" \n" + 
				"	 getDistance of side 1: "+ distance1 +"\n" + 
				"	 getDistance of side 2: "+ distance2 +"\n" +
				"	 getDistance of side 3: "+ distance3 +"\n" +
				"	 Normal Height: "+ getHeight()+"\n" +
				"	 Surface Area: "+ surfaceArea1+"\n"+
				"	 Volume:  "+ volume1 +"\n" ;
	}
}
class HeightNPTriangleException extends Exception 	{}