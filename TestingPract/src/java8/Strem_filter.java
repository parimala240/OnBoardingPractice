package java8;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Strem_filter {

	public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25));  
        productsList.add(new Product(2,"Dell Laptop",30));  
        productsList.add(new Product(3,"Lenevo Laptop",28));  
        productsList.add(new Product(4,"Sony Laptop",28));  
        productsList.add(new Product(5,"Apple Laptop",90));  
        // This is more compact approach for filtering data which is equal 30  
        productsList.stream()  
                             .filter(product -> product.price == 30)  
                             .forEach(product -> System.out.println(product.name));  
        
        // max() method to get max Product price   
        Product productA = productsList.stream()  
                        .max((product1, product2)->   
                        product1.price > product2.price ? 1: -1).get();  
          
        //System.out.println(productA.price); 
        
        
        // min() method to get min Product price 
       
        Product productB = productsList.stream()  
                .max((product1, product2)->   
                product1.price < product2.price ? 1: -1).get(); 
        
       // System.out.println(productB.price);  
        
        List<Product> sortedList = productsList.stream()
    			.sorted(Comparator.comparingInt(Product::getprice))
    			.collect(Collectors.toList());

        System.out.println("sortedList"+sortedList.get(0).price); 
        
        // filter the data and send to list 
        List<Integer> productPriceList2 =productsList.stream()  
                .filter(p -> p.price > 30000)// filtering data  
                .map(p->p.price)        // fetching price  
                .collect(Collectors.toList()); // collecting as list   (if set use toSet()) 
//System.out.println(productPriceList2);
    }  
}
