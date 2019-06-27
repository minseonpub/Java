//Q5.
//Pair.java

public class Pair <F,S> 
{
	public F[] fir;
	public S[] sec;

	public F GetF()
	{
		return fir[0];
	}
	
	public S GetS()
	{
		return sec[0];
	}
	
	public void setForF(int num)
	{
		F temp=null;
		
		temp = fir[0];
		fir[0]= fir[num];
		fir[num] = temp;
		
		// automatically set pairs.
		setForS(num);
	}
	public void setForS(int num)
	{
		S temp=null;
		
		temp = sec[0];
		sec[0]= sec[num];
		sec[num] = temp;
	}	
} // end of Pair class
