package EpamPractice1.A3Test1;

enum Color 
{ 
    RED, GREEN, BLUE; 
}
enum Season{   
WINTER(5), SPRING(10), SUMMER(15), FALL(20);   
  
int value;  
private Season(int value){  
this.value=value;  
} 

} 
public class CarsEnum 
{ 
    public static void main(String[] args) 
    { 
        // Calling values() 
        Color arr[] = Color.values(); 
  
        // enum with loop 
        for (Color col : arr) 
        { 
            // Calling ordinal() to find index 
            // of color. 
            System.out.println(col + " at index "
                             + col.ordinal()); 
        } 
  
        Color a= Color.RED;
        //System.out.println(a);
        //System.out.println(Color.RED);
        System.out.println(Color.valueOf("RED")); 
        // System.out.println(Color.valueOf("WHITE")); 
        
        
        for (Season s : Season.values())  {
        	System.out.println(s+" "+s.value);  
        	  
        	}

    } 
} 