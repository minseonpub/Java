import java.util.Scanner;

public class EquilateralTriangularPyramid extends EquilateralTriangularPrism 
{
	private double slantHeight;
	
	EquilateralTriangularPyramid()
	{
		Scanner scan = new Scanner(System.in);
		double sh;

		System.out.print("Please enter slant height: ");
		while(true)
		{
			sh = scan.nextDouble();
			setSHeight(sh);
			try 
			{
				if(getSHeight()==0||getSHeight()<0)	throw new SHeightNPTriangleException();
				else if(getSHeight()<=getHeight())   throw new SHeightTriangleException();
			}
			catch(SHeightNPTriangleException sheightNPexception)
			{
				System.err.println("\nError: Slant height should be positive.\n");
				System.out.print("Please input correct Slant Height: ");
				continue;
			}
			catch(SHeightTriangleException sheightexception)
			{
				System.err.println("\nError: Slant Height should be larger than normal Height. \n");
				System.out.print("Please input correct Slant Height: ");
				continue;
			}
			break;
		}
	}
	
	public void setSHeight(double h) 	{slantHeight=h;}
	
	public double getSHeight() 
	{
		double sh=slantHeight;
		Double.parseDouble(String.format("%.1f",sh));
		return sh;
	}
	
	public double getLateral()
	{
		double p =getParimeter()*2;
		double sh = getSHeight();
		return p*sh/2;
	}
	
	public double getSurfaceArea() 
	{
		double p =getParimeter()*2;
		return  (getArea()+p*getSHeight()/2);	
	}

	public double getVolume()
	{
		double sas = getArea();
		double h = getHeight();
		
		return sas*h/3;
	}
	
	@Override
	public String toString()
	{
		double distance1 = getDistance(getV1(), getV2());
		double distance2 = getDistance(getV2(), getV3());
		double distance3 = getDistance(getV2(), getV3());
		distance1 = Double.parseDouble(String.format("%.1f",distance1));
		distance2 = Double.parseDouble(String.format("%.1f",distance2));
		distance3 = Double.parseDouble(String.format("%.1f",distance3));
		double surfaceArea1 =  getSurfaceArea();
		surfaceArea1 = Double.parseDouble(String.format("%.2f",surfaceArea1));
		double volume1 = getVolume();
		volume1=Double.parseDouble(String.format("%.2f",volume1));
		
		return "Type of shape:" + getClass().getName()+ "\n" + 
				"	 Coordinates of Vertex One: "+ getV1()+ "\n" + 
				"	 Coordinates of Vertex Two: "+ getV2()+" \n" + 
				"	 Coordinates of Vertex Three: "+ getV3()+" \n" + 
				"	 getDistance of side 1: "+ distance1 +"\n" + 
				"	 getDistance of side 2: "+ distance2 +"\n" +
				"	 getDistance of side 3: "+ distance3 +"\n" +
				"	 Normal Height: "+ getHeight()+"\n" +
				"	 Slant Height: "+ getSHeight()+"\r\n" +
				"	 Surface Area: "+ surfaceArea1+"\n"+
				"	 Volume:  "+ volume1 +"\n" ;	
	}
	
}
class SHeightNPTriangleException extends Exception 	{}
class SHeightTriangleException extends Exception 	{}