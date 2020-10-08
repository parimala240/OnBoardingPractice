package Overriding;

public class TestOverride1 {
	int speed =30;
	public void walk() {
		
System.out.print("walk--111---");
	}

	public static void run() {
    	System.out.print("run--111---");	

	}
    public int jump() {
	
    	System.out.print("jump--11--"+speed);
     return speed;
   }

    
   public int fly() {
	   
	   System.out.print("fly--11--"+300);
    	 return 300;
    	   }
public Object flyreturn() {
	   
	   System.out.print("fly--11--"+300);
    	 return 300;
    	   }
   final public static void cook() {
   	System.out.print("cook--111---");	

	}

}
