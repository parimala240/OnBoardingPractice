package java8;

public class Product {
	int id;  
    String name;  
    int price;  
    public Product(int id, String name, int price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    } 
    
    public int getprice() {
        return price;
    }
    
    public String getname() {
        return name;
    }
}
