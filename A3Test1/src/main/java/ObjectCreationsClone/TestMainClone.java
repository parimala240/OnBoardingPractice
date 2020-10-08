package ObjectCreationsClone;

public class TestMainClone {
	
	    public static void main(String args[]) throws
	                          CloneNotSupportedException 
	    { 
	       TestClass2 t1 = new TestClass2(); 
	       t1.a = 10; 
	       t1.b = 20; 
	       t1.c.rollno = 30; 
	       t1.c.name = "parimala"; 
	  
	       TestClass2 t2 = (TestClass2)t1.clone(); 
	  
	       // Creating a copy of object t1 and passing 
	       //  it to t2 
	       t2.a = 100; 
	  
	       // Change in primitive type of t2 will not 
	       // be reflected in t1 field 
	       t2.c.rollno = 300; 
	  
	       // Change in object type field will be 
	       // reflected in both t2 and t1(shallow copy) 
	       System.out.println(t1.a + " " + t1.b + " " + 
	                          t1.c.rollno + " " + t1.c.name); 
	       System.out.println(t2.a + " " + t2.b + " " + 
	                          t2.c.rollno + " " + t2.c.name); 
	    } 
	}

