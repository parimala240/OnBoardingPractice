package Comparable;

import java.util.Comparator;

class AgeComparator implements Comparator<Student>{  
public int compare(Student s1,Student s2){  
if(s1.getStudentage()==s2.getStudentage())  
return 0;  
else if(s1.getStudentage()>s2.getStudentage())  
return 1;  
else  
return -1;  
}  
}
