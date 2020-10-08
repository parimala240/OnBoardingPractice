package OverLoading;

public class TestOverload1 {

	
	 final public int add(int a, int b) 
	    { 
	          
	        int sum = a+b; 
	        return sum; 
	    } 
	      
	    // adding three integer value. 
	   /* public double add(int a, int b) 
	    { 
	        double sum = a+b+0.0; 
	        return sum; 
	    }*/
	    
	    public double add(double a, double b, double c){ 
	           
	        double sum = a+b+c; 
	        return sum; 
	    } 
	    public int add(int a, int b, int c){ 
	           
	        int sum = a+b+c; 
	        return sum; 
	    } 
}
