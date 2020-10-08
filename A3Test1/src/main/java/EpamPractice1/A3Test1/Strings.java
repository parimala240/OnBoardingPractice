package EpamPractice1.A3Test1;

import java.util.Objects;

public class Strings {

	public static void main(String[] args) {
		 String string1 = new String("Geeksforgeeks"); 
	        String string2 = new String("Geeks"); 
	        String string3 = new String("Geeks"); 
	        String string4 = "Geeks"; 
	        String string5 = "Geeks";
	  
	        // Comparing for String 1 != String 2 
	        System.out.println("Comparing " + string1 + " and " + string2 
	                           + " : " + Objects.equals(string1, string2));
	        
	        System.out.println("Comparing " + string1 + " and " + string2 
                    + " : " + string1.equals(string2));
	        
	        System.out.println("Comparing " + string1 + " and " + string2 
                    + " : " + string1.equalsIgnoreCase(string2));
	        
	        System.out.println( " : " + string2.equalsIgnoreCase(string4));
	        if(string4==string2) {
	        	System.out.println( "pass");
	        }

	}
	
	public static int stringCompare(String str1, String str2) 
    {   
		int l1 = str1.length(); 
        int l2 = str2.length(); 
        int lmin = Math.min(l1, l2); 
		for (int i = 0; i < lmin; i++) { 
            int str1_ch = (int)str1.charAt(i); 
            int str2_ch = (int)str2.charAt(i); 
  
            if (str1_ch != str2_ch) { 
                return str1_ch - str2_ch; 
            } 
        }
		return lmin;  
  
    }

}
