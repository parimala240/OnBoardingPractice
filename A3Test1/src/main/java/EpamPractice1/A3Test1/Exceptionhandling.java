package EpamPractice1.A3Test1;

public class Exceptionhandling {

	public static void main(String[] args) {
		 try  
	        {  
	        int data=50/0; //may throw exception   
	        }  
	            //handling the exception  
	        catch(ArithmeticException e)  
	        {  
	            System.out.println(e);  
	        } 
		 finally{System.out.println("finally block is always executed");}  
	        System.out.println("rest of the code"); 
	        

	}
	void m(){  
		throw new ArithmeticException("sorry");  
		}  
	
	void mmx()throws ArithmeticException{  }
}
