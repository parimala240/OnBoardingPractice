package java8;

import java.util.Comparator;

public class Student implements Comparable<Student>{
	private String studentname;
    private int rollno;
    private int studentage;

    public Student(int rollno, String studentname, int studentage) {
        this.rollno = rollno;
        this.studentname = studentname;
        this.studentage = studentage;
    }
    
    public String getStudentname() {
        return studentname;
   }
   
   public int getRollno() {
	return rollno;
   }
  /* public void setRollno(int rollno) {
	this.rollno = rollno;
   }*/
   public int getStudentage() {
	return studentage;
   }
   

@Override
public int compareTo(Student student) {
	
	return  student.getRollno()-rollno;

}	



}