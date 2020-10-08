package Comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Sorting {
	public static void main(String args[]){
		   ArrayList<Student> arraylist = new ArrayList<Student>();
		   arraylist.add(new Student(223, "Chaitanya", 26));
		   arraylist.add(new Student(245, "Rahul", 24));
		   arraylist.add(new Student(209, "Ajeet", 32));

		   
    // Collections sorting using comparable based on Id
		    /*//Collections.sort(arraylist,Collections.reverseOrder());
		    Collections.sort(arraylist);

		   for(Student str: arraylist){
				System.out.println(str.getRollno()+"---"+str.getStudentage());
		   }*/
		   
    // Arrays sorting using comparable based on Id
		   Student[] stu = {new Student(227, "Chaitanya", 26),new Student(224, "AChaitanya", 35),new Student(225, "FChaitanya", 16)};
           Arrays.sort(stu);
          for(Student str: stu){
            System.out.println(str.getRollno()+"---"+str.getStudentage()+"--"+str.getStudentname());
             }
          
     // Arrays sorting using comparator based on Name
         /* Collections.sort(arraylist,new NameComparator()); 
          
          for(Student str: arraylist){
				System.out.println(str.getRollno()+"---"+str.getStudentage()+"---"+str.getStudentname());
		   }*/
          
     // Arrays sorting using comparator based on AGE
          Collections.sort(arraylist,new AgeComparator()); 
          
          for(Student str: arraylist){
				System.out.println(str.getRollno()+"---"+str.getStudentage()+"---"+str.getStudentname());
		   }

}

}