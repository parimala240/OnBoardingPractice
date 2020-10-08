package Association;

import java.util.ArrayList;
import java.util.List;

public class TestAbstraction {

	public static void main(String[] args) {
		House s1 = new House("Mia", 1, "rainbow"); 
        House s2 = new House("Priya", 2, "centro"); 
        House s3 = new House("John", 1, "bankbagar"); 
        House s4 = new House("Rahul", 2, "templestreet"); 
        
        List <House> tolet_house = new ArrayList<House>(); 
        tolet_house.add(s1); 
        FlotsRentCost tolets = new FlotsRentCost("mainRoad", tolet_house); 
        
        List <FlotsRentCost> aprtments = new ArrayList<FlotsRentCost>(); 
        aprtments.add(tolets);
        TestAbstraction institute = new TestAbstraction("BITScolony", aprtments); 
        
        System.out.print("Total students in institute: "); 
        System.out.print(institute.getTotalHouses()); 
        
       // Department EE = new Department("EE", ee_students); 

	}
	private List<FlotsRentCost> flotsRentCosts;
	String aprtmentsname; 
     
      
	TestAbstraction(String aprtmentsname, List<FlotsRentCost> flotsRentCosts) 
    { 
        this.aprtmentsname = aprtmentsname; 
        this.flotsRentCosts = flotsRentCosts; 
    } 
	public int getTotalHouses() 
    { 
        int noOfHouses = 0; 
        List<House> houses;  
        for(FlotsRentCost dept : flotsRentCosts) 
        { 
        	houses = dept.getHouseFlots(); 
            for(House s : houses) 
            { 
            	noOfHouses++; 
            } 
        } 
        return noOfHouses; 
    } 
}
