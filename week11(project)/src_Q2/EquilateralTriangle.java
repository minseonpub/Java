import java.util.Scanner;

public class EquilateralTriangle implements Shapes
{
	private Point2D v1, v2, v3;
		
	EquilateralTriangle() 
	{
		// TODO Auto-generated constructor stub
		Scanner scan = new Scanner(System.in);
		v1 = new Point2D();
	    v2 = new Point2D();
	    v3 = new Point2D();    
		double a, b, c, d, e, f;
		while(true) 
	    {
			System.out.print("Please input x-coordinate of the Vertex 1 of the triangle: ");
			a = scan.nextDouble();
			System.out.print("Please input y-coordinate of the Vertex 1 of the triangle: ");
			b = scan.nextDouble();
			System.out.print("Please input x-coordinate of the Vertex 2 of the triangle: ");
			c = scan.nextDouble();
			System.out.print("Please input y-coordinate of the Vertex 2 of the triangle: ");
			d = scan.nextDouble();
			System.out.print("Please input x-coordinate of the Vertex 3 of the triangle: ");
			e = scan.nextDouble();
			System.out.print("Please input y-coordinate of the Vertex 3 of the triangle: ");
			f = scan.nextDouble();
			this.setPoint(a, b, c, d, e, f);
			try
			{
				if(this.checkPositive(this.getV1(), this.getV2(), this.getV3())==false)//삼각형이 만들어지지 않으면
						throw new NotMakeTriangleException();
				else if(this.checkCollinear(this.getV1(), this.getV2(), this.getV3())==false)
						throw new CollinearTriangleException();
			} 
			catch(NotMakeTriangleException no)
			{
				System.err.println("\nError: the three vertices are collinear. Please enter non-collinear vertices\n");
				continue;
			} 
			catch(CollinearTriangleException cT)
			{
				System.err.println("Warning: the three sides are not equal, but continue your operation.\r");
				break;
			}
	    	break;
	    }
	}
	
	public void setPoint(double a, double b, double c, double d, double e, double f)
	{
		this.v1.setXY(a, b);
		this.v2.setXY(c, d);
	    this.v3.setXY(e, f);

	}
	public Point2D getV1() {return this.v1;}
	public Point2D getV2() {return this.v2;}
	public Point2D getV3() {return this.v3;}
	
	@Override
	public double getDistance(Point2D a, Point2D b)
	{
		return Math.sqrt(((b.getX()-a.getX())*(b.getX()-a.getX()))+((b.getY()-a.getY())*(b.getY()-a.getY())));
	}
	
	@Override
	public double getArea() 
	{
		double a = getDistance(v1, v2);
		double b = getDistance(v1, v3);
		double c = getDistance(v2, v3);
		
		double p = this.getParimeter();
		return Math.sqrt(p*(p-a)*(p-c)*(p-b));
	}
	
	@Override
	public String toString()
	{
		double distance1 = getDistance(this.getV1(), this.getV2());
		double distance2 = getDistance(this.getV2(), this.getV3());
		double distance3 = getDistance(this.getV2(), this.getV3());
		Double.parseDouble(String.format("%.1f",distance1));
		Double.parseDouble(String.format("%.1f",distance2));
		Double.parseDouble(String.format("%.1f",distance3));
		double surfaceArea =  this.getArea();
		Double.parseDouble(String.format("%.1f",surfaceArea));
		
		return "Type of shape:" + this.getClass().getName()+ "\r\n" + 
				"	 Coordinates of Vertex One: "+ this.getV1()+ "\r\n" + 
				"	 Coordinates of Vertex Two: "+ this.getV2()+" \r\n" + 
				"	 Coordinates of Vertex Three: "+ this.getV3()+" \r\n" + 
				"	 getDistance of side 1: "+ distance1 +"\r\n" + 
				"	 getDistance of side 2: "+ distance2 +"\r\n" +
				"	 getDistance of side 3: "+ distance3 +"\r\n" +
				"	 Surface Area: "+ surfaceArea+"\r\n";
	}
	
	public double getParimeter()
	{
		if(checkCollinear(this.getV1(), this.getV2(), this.getV3())==true)
		{
			double p = getDistance(this.getV1(), this.getV2())*3/2;
			return p;
		}
		else
		{
			double a = getDistance(this.getV1(), this.getV2());
			double b = getDistance(this.getV1(), this.getV3());
			double c = getDistance(this.getV2(), this.getV3());
			
			double p = (a+b+c)/2;
			return p;
		}
	}
	public boolean checkPositive(Point2D a, Point2D b, Point2D c)
	{
		double maxA=0,med=0, min=0;
		double sum = 0;
		maxA = Math.max(Math.max(getDistance(a, b), getDistance(b, c)), getDistance(a, c));
		
		sum = getDistance(a, b)+getDistance(b, c) + getDistance(a, c);
		if(maxA>=sum-maxA) return false;
		else return true;
	}
	
	public boolean checkCollinear(Point2D a, Point2D b, Point2D c) 
	{
		if(getDistance(a, b)==getDistance(b, c)&&getDistance(b, c)==getDistance(a, c)&&getDistance(a, c)==getDistance(a, b)) return true;
		else return false;
	}
}

class NotMakeTriangleException extends Exception {}
class CollinearTriangleException extends Exception {}
