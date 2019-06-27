// Point
public class Point2D {
	
	private double x;
	private double y;
	
	public double getX()
	{
		return this.x;
	}
	
	public double getY()
	{
		return this.y;
	}

	public void setXY(double x, double y)
	{
		this.x =x;
		this.y= y;
	}
	
	public void setY(double y)
	{
		this.y= y;
	}
	public void setX(double x)
	{
		this.x= x;
	}
	@Override
	public String toString()
	{
		double xpoint = this.getX();
		Double.parseDouble(String.format("%.1f",xpoint));
		double ypoint = this.getY();
		Double.parseDouble(String.format("%.1f",ypoint));
		return xpoint+" , "+ypoint;
	}	
}
