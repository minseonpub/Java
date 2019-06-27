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
			this.setSHeight(sh);
			try 
			{
				if(this.getSHeight()==0||this.getSHeight()<0)	throw new SHeightNPTriangleException();
				else if(this.getSHeight()<=super.getHeight())   throw new SHeightTriangleException();
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
	
	public void setSHeight(double h) 	{this.slantHeight=h;}
	
	public double getSHeight() 
	{
		double sh=this.slantHeight;
		Double.parseDouble(String.format("%.1f",sh));
		return sh;
	}
	
	public double getLateral()
	{
		double p =super.getParimeter()*2;
		double sh = this.getSHeight();
		return p*sh/2;
	}
	
	public double getSurfaceArea() 
	{
		double p =super.getParimeter()*2;
		return  (super.getArea()+p*this.getSHeight()/2);	
	}

	public double getVolume()
	{
		double sas = super.getArea();
		double h = super.getHeight();
		
		return sas*h/3;
	}
	
	@Override
	public String toString()
	{
		double distance1 = getDistance(this.getV1(), this.getV2());
		double distance2 = getDistance(this.getV2(), this.getV3());
		double distance3 = getDistance(this.getV2(), this.getV3());
		distance1 = Double.parseDouble(String.format("%.1f",distance1));
		distance2 = Double.parseDouble(String.format("%.1f",distance2));
		distance3 = Double.parseDouble(String.format("%.1f",distance3));
		double surfaceArea1 =  this.getSurfaceArea();
		surfaceArea1 = Double.parseDouble(String.format("%.2f",surfaceArea1));
		double volume1 = this.getVolume();
		volume1=Double.parseDouble(String.format("%.2f",volume1));
		
		return "Type of shape:" + this.getClass().getName()+ "\n" + 
				"	 Coordinates of Vertex One: "+ this.getV1()+ "\n" + 
				"	 Coordinates of Vertex Two: "+ this.getV2()+" \n" + 
				"	 Coordinates of Vertex Three: "+ this.getV3()+" \n" + 
				"	 getDistance of side 1: "+ distance1 +"\n" + 
				"	 getDistance of side 2: "+ distance2 +"\n" +
				"	 getDistance of side 3: "+ distance3 +"\n" +
				"	 Normal Height: "+ this.getHeight()+"\n" +
				"	 Slant Height: "+ this.getSHeight()+"\r\n" +
				"	 Surface Area: "+ surfaceArea1+"\n"+
				"	 Volume:  "+ volume1 +"\n" ;	
	}
	
}
class SHeightNPTriangleException extends Exception 	{}
class SHeightTriangleException extends Exception 	{}