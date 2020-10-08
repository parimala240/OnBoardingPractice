package ExceptionOveriding;

import java.io.FileNotFoundException;

public class ExceptionsExample {
	public void sampleMethod()throws FileNotFoundException {
	      System.out.println("Method of Subclass");
	   }
	   public static void main(String args[]) throws FileNotFoundException {
	      ExceptionsExample obj = new ExceptionsExample();
	      obj.sampleMethod();
	   }
}
