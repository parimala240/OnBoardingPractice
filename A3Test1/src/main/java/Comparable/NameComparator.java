package Comparable;

import java.util.Comparator;

class NameComparator implements Comparator<Student>{  
public int compare(Student s1,Student s2){  
return s1.getStudentname().compareTo(s2.getStudentname());  
}
}
