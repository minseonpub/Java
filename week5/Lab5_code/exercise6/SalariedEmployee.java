// Fig. 10.14: SalariedEmployee.java


public class SalariedEmployee extends Employee
{
    
	private double weeklySalary;
    // constructor
    public SalariedEmployee(String firstName, String lastName, 
    		                String socialSecurityNumber, double weeklySalary)
    {
        // pass to Employee constructor
        super(firstName,lastName,socialSecurityNumber);
        
        if(weeklySalary<0.0)
        	throw new IllegalArgumentException("Weekly salary must be >= 0.0");
        
        this.weeklySalary = weeklySalary;
    }
    
    // set salary
    public void setWeeklySalary(double weeklySalary)
    {
        if(weeklySalary < 0.0)
        	throw new IllegalArgumentException("Weekly salary must be >= 0.0f");
      
        this.weeklySalary = weeklySalary;
    }
    
    public double getWeeklySalary()
    {
        return weeklySalary;
    }
    
    @Override
    public double getPaymentAmount() 
    {  
    	return getWeeklySalary();
    }

    @Override
    public double earnings() 
    {    
    	return getPaymentAmount();
    }
   
    @Override
    public String toString()
    {
        return String.format("salaried employee: %s\n%s: $%,.2f",
                super.toString(), "weekly salary", getWeeklySalary());
    }
}
