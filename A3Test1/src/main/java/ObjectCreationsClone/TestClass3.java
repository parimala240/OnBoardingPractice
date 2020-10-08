package ObjectCreationsClone;

public class TestClass3 {
	int rollno;  
	String name;  
	  
	TestClass3(int rollno,String name){  
	this.rollno=rollno;  
	this.name=name;  
	}  
	  
	public Object clone()throws CloneNotSupportedException{  
	return super.clone();  
	}  
	  
	public static void main(String args[]){  
	try{  
		TestClass3 s1=new TestClass3(101,"amit");  
	  
		TestClass3 s2=(TestClass3)s1.clone();  
	  
	System.out.println(s1.rollno+" "+s1.name);  
	System.out.println(s2.rollno+" "+s2.name);  
	  
	}catch(CloneNotSupportedException c){}  
	  
	}  
}
