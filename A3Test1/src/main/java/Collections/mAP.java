package Collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map.Entry;

public class mAP {

	 public static void main(String args[]){  
		   HashMap<Integer,String> hm=new HashMap<Integer,String>();    
		    System.out.println("Initial list of elements: "+hm);  
		      hm.put(100,"Amit");    
		      hm.put(101,"Vijay");    
		      hm.put(102,"Rahul");   
		       
		      System.out.println("After invoking put() method ");  
		      for(Entry<Integer, String> m:hm.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		      }  
		        
		      hm.putIfAbsent(103, "Gaurav");  
		      System.out.println("After invoking putIfAbsent() method ");  
		      for(Entry<Integer, String> m:hm.entrySet()){    
		           System.out.println(m.getKey()+" "+m.getValue());    
		          }  
		      HashMap<Integer,String> map=new HashMap<Integer,String>();  
		      map.put(104,"Ravi");  
		      map.putAll(hm);  
		      System.out.println("After invoking putAll() method ");  
		      for(Entry<Integer, String> m:map.entrySet()){    
		           System.out.println(m.getKey()+" "+m.getValue());    
		          }  
		 }  
	 
	 void methodss() {
		 Hashtable<Integer,String> map=new Hashtable<Integer,String>();          
	     map.put(100,"Amit");    
	     map.put(102,"Ravi");   
	     map.put(101,"Vijay");    
	     map.put(103,"Rahul");    
	     System.out.println("Initial Map: "+map);  
	     //Inserts, as the specified pair is unique  
	     map.putIfAbsent(104,"Gaurav");  
	     System.out.println("Updated Map: "+map);  
	     //Returns the current value, as the specified pair already exist  
	     map.putIfAbsent(101,"Vijay");  
	     System.out.println("Updated Map: "+map);  
	 } 
	 }

