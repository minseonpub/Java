// Fig. 9.10 : CommissionEmplyee.java
// CommisionEmployee class uses methods to manipulate its
// private instance variables.

public class CommissionEmployee 
{
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	private double grossSales; 	// gross weekly sales
	private double commisionRate;	// commission percentage
	
	//five-argument constructor
	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate)
	{
		// implicit call to object constructor occurs here
		
		// if grossSales is invalid throw exception
		if (grossSales <0.0)
			throw new IllegalArgumentException("Gross sales must be >=0.0");
			
		//if commissionRate is invalid throw exception
		if(commissionRate <= 0.0 || commissionRate >= 1.0)
			throw new IllegalArgumentException("Commission rate must be > 0.0 and <1.0");

		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.grossSales = grossSales;
		this.commisionRate =commissionRate;
	}//end constructor
	
	// return first name
	public String getFirstName()
	{
		return firstName;
	}
	
	// return last name
	public String getLastName()
	{
		return lastName;
	}
	
	// return social security number
	public String getSocialSecurityNumber()
	{
		return socialSecurityNumber;
	}
	
	// set gross sales amount
	public void setGrossSales(double grossSales)
	{
		if(grossSales < 0.0)
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		
		this.grossSales = grossSales;
	}
	
	// return gross sales amount
	public double getGrossSalses()
	{
		return grossSales;
	}
	
	//set commission rate
	public void setCommisionRate(double commissionRate)
	{
		if(commissionRate <= 0.0 || commissionRate >= 1.0)
			throw new IllegalArgumentException("Commission rate must be > 0.0 and <1.0");
		
		this.commisionRate = commissionRate;
	}
	
	// return commission rate
	public double getCommissionRate()
	{
		return commisionRate;
	}
	
	// calculate earnings
	public double earnings()
	{
		return getCommissionRate()*getGrossSalses();
	}
	
	//return String representation of CommissionEmployee object
	@Override
	public String toString()
	{
		return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f", 
					"commission employee", getFirstName(), getLastName(), 
					"social security number", getSocialSecurityNumber(), 
					"gross sales", getGrossSalses(),
					"commission rate", getCommissionRate());		
	}
}// end class CommssionEmployee
