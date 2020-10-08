package Association;

import java.util.List;

public class FlotsRentCost {

	String flot; 
    private List<House> Houses; 
    FlotsRentCost(String flot, List<House> Houses)  
    { 
          
        this.flot = flot; 
        this.Houses = Houses; 
          
    } 
      
    public List<House> getHouseFlots()  
    { 
        return Houses; 
    } 
}
