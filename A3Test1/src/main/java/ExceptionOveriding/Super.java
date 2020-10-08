package ExceptionOveriding;

import java.io.FileNotFoundException;

abstract class Super {
		   public void sampleMethod()throws FileNotFoundException {
		      System.out.println("Method of superclass");
		   }
		   
		   public String readFile(String path)throws FileNotFoundException {
			      throw new FileNotFoundException();
			   }
		}

