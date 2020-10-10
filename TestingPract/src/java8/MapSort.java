package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class MapSort {

	public static void main(String[] args) {
		Map<Product,Integer> mapobj = new TreeMap<>((obj1,obj2)-> (int) obj1.getprice()-obj2.getprice());
		//Map<Product,Integer> mapobj = new TreeMap();
		
		mapobj.put(new Product(1,"HP Laptop",25),11);  
		mapobj.put(new Product(2,"Dell Laptop",30),12);  
		mapobj.put(new Product(3,"Lenevo Laptop",28),13);  
		mapobj.put(new Product(4,"Sony Laptop",28),9);  
		mapobj.put(new Product(5,"Apple Laptop",90),7);  
		
		mapobj.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		System.out.println("=======================================");
		
		mapobj.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Product::getprice))).forEach(System.out::println);  //reversed()
		
		
		
		/*List<Entry<Product,Integer>> sampleList = new ArrayList<>(mapobj.entrySet());
		Collections.sort((sampleList,(obj1,obj2)->obj1.getKey().compareTo(obj2.getprice()));*/
	}

}
