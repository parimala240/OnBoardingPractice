package java8;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sorting {

	
		public static void main(String args[]){
			   ArrayList<Student> arraylist = new ArrayList<Student>();
			   arraylist.add(new Student(223, "Chaitanya", 26));
			   arraylist.add(new Student(245, "Rahul", 24));
			   arraylist.add(new Student(209, "Ajeet", 32));

			    //Collections.sort(arraylist,Collections.reverseOrder());

			   for(Student str: arraylist){
					//System.out.println(str.getRollno()+"---"+str.getStudentage());
			   }
			   
			   Student[] stu = {new Student(227, "Chaitanya", 26),new Student(224, "AChaitanya", 35),new Student(225, "FChaitanya", 16)};
Arrays.sort(stu);
for(Student str: stu){
	System.out.println(str.getRollno()+"---"+str.getStudentage()+"--"+str.getStudentname());
}


//arraylist.stream().filter(i->i>10).mapToInt(i->i).sum();

//object aa= arraylist.stream().filter(o -> o.getStudentname().equals("Chaithaya")).findFirst().isPresent();



	}

}
