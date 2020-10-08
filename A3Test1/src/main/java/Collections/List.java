package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class List {

	public static void main(String[] args) {
		

	}
	
	
	public void total() {
		/*List <data-type> list1= new ArrayList();  
		List <data-type> list2 = new LinkedList();  
		List <data-type> list3 = new Vector();  
		List <data-type> list4 = new Stack();*/
	}
	public void ArrayList1() {
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		list.add("Ravi");//Adding object in arraylist  
		list.add("Vijay");  
		list.add("Ravi");  
		list.add("Ajay");  
		//Traversing list through Iterator 
		//The Iterable interface is the root interface for all the collection classes
		Iterator itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		
		ListIterator<String> list1=list.listIterator(list.size());  
        while(list1.hasPrevious())  
        {  
            String str=list1.previous();  
            System.out.println(str);  
        } 
        
        for(int i=0;i<list.size();i++)  
        {  
         System.out.println(list.get(i));     
        }
        
        list.forEach(a->{ //Here, we are using lambda expression  
            System.out.println(a);  
          });
	}

}
