// Student.java
class Student 
{
	String name;
	int ID;
	public Student(String name, int ID)
	{
		this.name = name;
		this.ID = ID;
	}
	@Override
	public String toString()
	{
		//return "Student name "+name+" and ID : "+ID; 
		
		//Question 2-(b)
		return getClass().getName()+" @ "+Integer.toHexString(hashCode());
	}
	/*
	// Question 5 
	@Override
	public boolean equals(Object obj)	// S1.equal(S2)
	{
		try
		{
			String name1 = this.name;	// this refers to S1
			int ID1= this.ID;
			
			Student s = (Student)obj;
			String name2 = s.name;
			int ID2= s.ID;
			
			if(name1.contentEquals(name2)&&(ID1==ID2))
				return true;
			else 
				return false;
			
		} // end of try block
		catch(ClassCastException e)
		{
			return false;
		}
		catch(NullPointerException e)
		{
			return false;
		}
	}//end of equals
	*/
	
	//problem 6
	/*@Override
	public boolean equals(Object obj) 
	{
		try 
		{
			Student s = (Student)obj;
			
			if (name.equals(s.name) && (ID == s.ID)) 
			{
				return true;
			} 
			else 
			{
				return false;
			}
		} 
		catch (ClassCastException e) 		//Error of casting
		{
			return false;
		} 
		catch (NullPointerException e) 		//변수 선언후 생성전에 접근시 에러
		{
			return false;
		}
	}*/
	//problem 7
	@Override
	public boolean equals(Object obj) 
	{
		if (obj instanceof Student) 
		{
			Student s = (Student)obj;
			
			if (name.equals(s.name) && (ID == s.ID)) 	// casting yes or no
				return true;
			else 
				return false;
		}
		else 
			return false;
	}
	
	//problem 8
	/*@Override
	public boolean equals(Object obj) 
	{
		if (obj == this) 
		{
			return true;
		}
		if (obj instanceof Student) 
		{
			Student s = (Student)obj;
			
			if (name.equals(s.name) && (ID == s.ID))
			{
				return true;
			} 
			else 
			{
				return false;
			}	
		} 
		else 
		{
			return false;
		}
	}*/

	public static void main(String[] arg)
	{
		Student S1 = new Student("Kim", 101);
		Student S2 = new Student("Homin",102);
		/*
		System.out.println(S1);
		System.out.println(S1.toString());
		System.out.println(S2);
		*/	
		Student S3 = new Student("Homin",102);
		Student S4 = S1;
		System.out.println(S1.equals(S2));
		System.out.println(S1.equals(S3));
		System.out.println(S1.equals(S4));
	
		System.out.println(S1.equals("Kim"));
		System.out.println(S1.equals(null));
	}// end of main
}// end of class

