package ObjectCreationsClone;

import java.lang.reflect.Constructor;

public class ConstructorNewInstance {
 
    private String name; 
    ConstructorNewInstance() 
    { 
    } 
    public void setName(String name) 
    { 
        this.name = name; 
    } 
    public static void main(String[] args) 
    { 
        try
        { 
            Constructor<ConstructorNewInstance> constructor 
                = ConstructorNewInstance.class.getDeclaredConstructor(); 
            ConstructorNewInstance r = constructor.newInstance(); 
            r.setName("GeeksForGeeks"); 
            System.out.println(r.name); 
        } 
        catch (Exception e) 
        { 
            e.printStackTrace(); 
        } 
    } 
} 