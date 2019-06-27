
public class Employee
{
    private String firstName;
    private String lastName;
    private final Date birthDate;
    private final Date hireDate;

    // constructor to initialize name, birth date and hire date
    public Employee(String firstName, String lastName, Date birthDate, Date hirDate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate =birthDate;
        this.hireDate = hirDate;
    }
    //public Employee()	
    {
    	
    }
  
    //3-B : set BirthDate variable in method
    public void SetBirthDate(Date birthDate)
    {
    	//this.birthDate = birthDate;
    }
    
    //3-B: set HireDate variable in method
    public void SetHireDate(Date hirDate)
    {
    	//this.hireDate =  hirDate;   	
    }
      
    //convert Employee to String format
    public String toString()
    {
       return String.format("%s %s Hired: %s  Birthday: %s",
                             lastName, firstName, hireDate, birthDate);
    }
}// end class Employee




