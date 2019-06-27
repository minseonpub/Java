// Fig. 10.13: Employee.java
// Employee abstract superclass that implements Payable.

public abstract class Employee implements Payable
{
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    // constructor
    public Employee(String firstName, String lastName, String socialSecurityNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }
    
    public void setFirstName(String first) 
    {
    	firstName = first;
    } 
    
    public String getFirstName() 
    {
    	return firstName;
    }
    
    public void setLastName(String last) 
    {
    	lastName=last;
    }
    
    public String getLastName() 
    {
    	return lastName;
    }
    
    public void setSocialSecurityNumber(String ssn) 
    {
    	socialSecurityNumber = ssn;
    }
    
    public String getSocialSecurityNumer() 
    {
    	return socialSecurityNumber;
    }
    
    @Override
    public String toString(){
        return String.format("%s %s\nsocial security number: %s",
                             getFirstName(), getLastName(), getSocialSecurityNumer());
    }
 
    public double earnings()
    {
    	return 0.0;
    }
    // Notice : We do not implement Payable method getPaymentAmount here so 
    // this class must be declared abstract to avoid a compilation error.   
}




