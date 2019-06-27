// SetOperations.java
import java.util.HashSet;
import java.util.Set;

public class SetOperations
{
  public static Set<String> union(Set<String> s1, Set<String> s2)
  {
	  Set<String> un=new HashSet<String>();
	  un.addAll(s1);
	  for(String a : s2)
		  if(s2.equals(a)==true)	continue;
		  else un.add(a);
	  return un;
  }
  public static Set<String> intersection(Set<String> s1, Set<String> s2)
  {
	  Set<String> un=new HashSet<String>();
    for (String x : s1)
        if (s2.contains(x))
          un.add(x);
	  return un;		  			
  }
  public static Set<String> difference(Set<String> s1, Set<String> s2)
  {
	  Set<String> un=new HashSet<String>(s1);
	  un.removeAll(s2);
	  
	  return un;
  }
 public static void main(String args[])
 {
	Set<String> footBallTeam=new HashSet<String>();
	footBallTeam.add("Frank");
	footBallTeam.add("Amjad");
	footBallTeam.add("Jim");
	
	Set<String> basketBallTeam=new HashSet<String>();
	basketBallTeam.add("David");
	basketBallTeam.add("Frank");
	basketBallTeam.add("Scott");
	
	Set<String> unionSet=union(footBallTeam,basketBallTeam);
	Set<String> intersectionSet=intersection(footBallTeam,basketBallTeam);
	Set<String> differenceSet=difference(footBallTeam,basketBallTeam);
	for(String member:differenceSet)
	System.out.println(member);
  }

}// end of the class 
