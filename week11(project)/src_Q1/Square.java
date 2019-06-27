import java.util.Scanner;

public class Square implements Shapes
{
	
	private Point2D UL, // upperLeft
    			LR;		//LowerRight
	
	public Point2D getUL(){	return this.UL;	}
	public Point2D getLR(){	return this.LR;	}
	
	public void setPoint(double a, double b, double c, double d)
	{
		 this.UL.setXY(a,b);
		 this.LR.setXY(c,d);
	}
	
	public Square() 
	{
		// TODO Auto-generated constructor stub
		Scanner scan = new Scanner(System.in);
		UL = new Point2D();
		LR = new Point2D();
		double a, b, c, d;
		while(true) 
	    {
			System.out.print("Please input x-coordinate of the Upper Left of the Square: ");
			a = scan.nextDouble();
			System.out.print("Please input y-coordinate  of the Upper Left of the Square: ");
			b = scan.nextDouble();
			System.out.print("Please input x-coordinate of the Lower Right of the Square : ");
			c = scan.nextDouble();
			System.out.print("Please input y-coordinate of the Lower Right of the Square : ");
			d = scan.nextDouble();
			
			this.setPoint(a, b, c, d);
			try
			{
			    if(this.getLR().getX()==this.getUL().getX() && this.getLR().getY()==this.getUL().getY())	throw new SamePointException();
				else if(this.getUL().getX()>= this.getLR().getX())throw new CollinearSquareXException();
				else if(this.getLR().getY()>= this.getUL().getY()) throw new CollinearSquareYException();
				else if((this.getUL().getX()-this.getUL().getX())==(this.getUL().getY()-this.getUL().getY())) throw new CollinearSquareException();
	
			} 
			catch(CollinearSquareException cs)
			{
				System.err.println("Warning: the two sides are not equal, but continue your operation.\n");
				break;
			}
			catch (SamePointException se)
			{
				System.err.println("\nError: x-coordinate of upper left vertex are same to x-coordinate of lower right vertex\n");
				System.out.println( "Please enter valid coordinates.\n" );
				continue;
			}
			catch(CollinearSquareXException csx)
			{
				System.err.println("\nError: x-coordinate of upper left vertex should be less than x-coordinate of lower right vertex\n");
				System.out.println( "Please enter valid coordinates.\n" );
				continue;
			} 
			catch(CollinearSquareYException csy)
			{
				System.err.println("\nError: y-coordinate of upper left vertex should be less than y-coordinate of lower right vertex.\n");
				System.out.println( "Please enter valid coordinates.\n" );
				continue;
			}
	    	break;
	    }
	}

	public double getParimeter()
	{
		double s1 = (this.getLR().getX()-this.getUL().getX());
		double s2 = (this.getUL().getY()-this.getLR().getY());
		if(s1==s2)
		{
			double p = s1*4;
			return p;
		}
		else
		{
			double p = s1*2+s2*2;
			return p;
		}
	}
	
	public String printSideSquare()
	{
		double s1 = (this.getLR().getX()-this.getUL().getX());
		double s2 = (this.getUL().getY()-this.getLR().getY());
		if(s1==s2)
			return "	 Side of a square:  "+ (this.getLR().getX()-this.getUL().getX())+"\r\n";
		else
		{
			return
			"	 Side of a square1:  "+ (this.getLR().getX()-this.getUL().getX())+"\r\n"+
			"	 Side of a square2:  "+ (this.getUL().getY()-this.getLR().getY())+"\r\n";
		}
	}
	
	@Override
	public double getArea()
	{
		return (LR.getX()-UL.getX())*(UL.getY()-LR.getY());
	}
	
	@Override
	public double getDistance(Point2D a, Point2D b)
	{
		return Math.sqrt(((b.getX()-a.getX())*(b.getX()-a.getX()))+((b.getY()-a.getY())*(b.getY()-a.getY())));
	}
	
	@Override
	public String toString()
	{
		double distance = getDistance(this.getUL(), this.getLR());
		double area = this.getArea();
		distance = Double.parseDouble(String.format("%.2f",distance));
		area=Double.parseDouble(String.format("%.2f",area));
		
		return "Type of shape: Square  \r\n" + 
				"	 coordinates of upper left vertex : "+ this.getUL()+ "\r\n" + 
				"	 coordinates of lower right vertex :  "+ this.getLR()+" \r\n" + this.printSideSquare() + 
				"	 Surface Area: "+ area+"\r\n";
	}
}
class CollinearSquareException extends Exception {}
class CollinearSquareXException extends Exception {}
class CollinearSquareYException extends Exception {}
class SamePointException extends Exception {}
