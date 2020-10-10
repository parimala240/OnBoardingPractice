import java.io.IOException;

public class Test3  extends Test5 {

	
		  void run(){System.out.println("Vehicle is running");}
		 void color() throws NullPointerException
			  {
				  System.out.println("White");
			  }  
		  
		  
		 
	public static void main(String[] args) {
		Test5 obj = new Test3();  
        try{
	   obj.color();
	}catch(Exception e){
	   System.out.println(e);
	 }
	
	 
	}

}
