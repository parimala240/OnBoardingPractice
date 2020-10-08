package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {

	public static final int MAX_SECONDS = 25;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set2=new HashSet();
		LinkedHashSet<String> set1=new LinkedHashSet();  
		  TreeSet<String> al=new TreeSet<String>();
		  TreeSet<String> set=new TreeSet<String>();  
	         set.add("A");  
	         set.add("B");  
	         set.add("C");  
	         set.add("D");  
	         set.add("E");  
		  
	        System.out.println("Initial Set: "+set);  
	           
	         System.out.println("Reverse Set: "+set.descendingSet());  
	           
	         System.out.println("Head Set: "+set.headSet("C", true));  
	          
	         System.out.println("SubSet: "+set.subSet("A", false, "E", true));  
	           
	         System.out.println("TailSet: "+set.tailSet("C", false));  

	}

}
