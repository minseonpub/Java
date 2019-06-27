// Demo1.java
import java.io.*; 
class Demo1
{ 
	  public static FileInputStream CreateFile(String fileName)
	  {
		  FileInputStream fis2 =null;
		  try 
		  {
			  fis2 = new FileInputStream(fileName);
			  System.out.println("File input stream is created");
		  }
		  catch(FileNotFoundException fnfe)
		  {
			System.err.println(fnfe);
		  }
		  return fis2;
	  } 
	  public static void main(String args[])
	  {
		FileInputStream fis1 = null;
		String fileName = "foo.bar";
	
		System.out.println("File name is "  + fileName); 
		fis1 = CreateFile(fileName);
		System.out.println("End of the program");
	 }
} 
