package EpamPractice1.A3Test1;

public class Stringbuilder {

	 public static void main(String[] args){  
	        StringBuilder builder=new StringBuilder("hello");  
	        builder.append("java");  
	        System.out.println(builder);  
	        
	        long startTime = System.currentTimeMillis();  
	        StringBuilder sb2 = new StringBuilder("Java");  
	        for (int i=0; i<10000; i++){  
	            sb2.append("Tpoint");  
	        }  
	        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");  
	        
	        
	        
	        System.out.println("Hashcode test of String:");  
	        String str="java";  
	        System.out.println(str.hashCode());  
	        str=str+"tpoint";  
	        System.out.println(str.hashCode());  
	   
	        System.out.println("Hashcode test of StringBuffer:");  
	        StringBuffer sb=new StringBuffer("java");  
	        System.out.println(sb.hashCode());  
	        sb.append("tpoint");  
	        System.out.println(sb.hashCode()); 
	    }  
	
}
