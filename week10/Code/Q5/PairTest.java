
public class PairTest 
{
	public static void main(String[] args)
	{
	   Pair<Integer,String> p = new Pair<>();
	   Integer[] i = {1, 2, 3};
	   String[] s = {"one", "second", "third"};
	   
	   p.fir = i;
	   p.sec = s;
	   
	   System.out.println("Original pair: ("+p.GetF()+" , "+p.GetS()+")");
	   
	   p.setForF(1);
	   
	   System.out.println("Modified pair: ("+p.GetF()+" , "+p.GetS()+")");
	}
}
