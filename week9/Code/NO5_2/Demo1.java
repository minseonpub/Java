// Demo1.java
import java.io.*; 
class Demo1
{ 
	  public static FileInputStream CreateFile(String fileName) throws FileNotFoundException
	  {
		  FileInputStream fis2 = new FileInputStream(fileName);
		  System.out.println("File input stream is created");
		  return fis2;
	  } 
	  public static void main(String args[])
	  {
		FileInputStream fis1 = null;
		String fileName = "foo.bar";
	
		System.out.println("File name is "  + fileName); 
		try 
		{
			fis1 = CreateFile(fileName);
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		System.out.println("End of the program");
	 }
} 
