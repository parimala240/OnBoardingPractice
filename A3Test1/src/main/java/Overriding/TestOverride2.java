package Overriding;

public class TestOverride2 extends TestOverride1{
	int speed =20;
	public void walk() {
		
System.out.print("walk--22---");
	}
    public static void run() {
    	System.out.print("run--22---");	

	}
    public int jump() {
	
    	System.out.print("jump--22--"+speed);
     return speed;
   }

    
   public int fly() {
	   
	   System.out.print("fly--22--"+200);
    	 return 200;
    	   }
   
   //covariant return type 
   @Override
   public String flyreturn() {
	   
	   System.out.print("fly--11--"+300);
    	 return "";
    	   }
   
   //final methods cannot overide 
   /*final public static void cook() {
	   	System.out.print("cook--111---");	

		}*/
}
