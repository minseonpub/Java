// Fig. 10.6: HourlyEmployee.java
// HourlyEmployee class extends Employee.
public class HourlyEmployee extends Employee 
{
	private double wage;	// wage per hour
	private double hours;	// hours worked for week
	
	//constructor
	public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours)
	{
		super(firstName, lastName, socialSecurityNumber);
		
		if(wage < 0.0)							// validate wage
			throw new IllegalArgumentException("Hourly wage must be >= 0.0");
		if((hours < 0.0)||(hours > 168.0))		// validate hours
			throw new IllegalArgumentException("Hours worked must be >= 0.0 and <=168.0");
		
		this.wage = wage;
		this.hours = hours;
	}
	 
	//set wage
	public void setWage(double wage)
	{
		if(wage<0.0)	// validate wage
			throw new IllegalArgumentException("Hourly wage must be >= 0.0");
		
		this.wage = wage;
	}
	
	//return wage
	public double getWage()
	{
		return wage;
	}
	
	// set hours worked
	public void setHours(double hours)
	{
		if((hours < 0.0)||(hours > 168.0))	// validate wage
			throw new IllegalArgumentException("Hours worked must be >= 0.0 and <=168.0");
		
		this.hours = hours;
	}
	
	public double getHours()
	{
		return hours;
	}
	
	@Override
	public double getPaymentAmount() 
	{
		if(getHours() <=40)	//no overtime
			return getWage()*getHours();
		else 
			return getWage()+(getHours() -40)*getWage()*1.5;
	}
	
	// calculate earnings : override abstract method earnings in Employee
	@Override
	public double earnings() 
	{
		return getPaymentAmount(); 
	}
	
	// return String representation of Employee object
	@Override
	public String toString()
	{
		return String.format("hourly employee: %s%n%s: $%,.2f; %s: %.2f", super.toString(), 
				"hourly wage", getWage(),
				"hourly worked", getHours());
	}
}// end class HourlyEmployee
