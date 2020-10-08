package HashCode;

public class Student {
	  
    String name; 
    int id; 
      
    Student(String name, int id) 
    { 
          
        this.name = name; 
        this.id = id; 
    } 
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public int hashCode(){
        System.out.println("In hashcode");
        int hashcode = this.id;
        return hashcode;
    }
     
    @Override
    public boolean equals(Object obj){
        //System.out.println("In equals");
        if(this == obj) 
            return true; 
        if(obj == null || obj.getClass()!= this.getClass()) 
            return false; 
        Student stu = (Student) obj; 
        return (stu.name.equals(this.name)  && stu.id == this.id); 
        
    }
    
        
      
}
