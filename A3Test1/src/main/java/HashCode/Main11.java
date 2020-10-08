package HashCode;

import java.util.HashMap;
import java.util.Map;

public class Main11 {
	
	public static void main (String[] args)  
    { 
          
        // creating two Objects with  
        // same state 
        Student g1 = new Student("aditya", 1); 
        Student g2 = new Student("aditya", 1); 
          
        Map<Student, String> map = new HashMap<Student, String>(); 
        map.put(g1, "CSE"); 
        map.put(g2, "IT"); 
          
        for(Student Student : map.keySet()) 
        { 
            System.out.println(map.get(Student).toString()); 
        }
        System.out.println(g1.equals(g2));
        System.out.println(map.containsKey(new Student("aditya", 1)));
  
    } 

}
