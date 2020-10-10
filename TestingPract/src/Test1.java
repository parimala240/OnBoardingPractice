import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test1 {

public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("------test----");


int[] a = {10,13,14,15,10,13,14,15};
//List<ff> hh = new ArrayList<>();
Set<Integer> setarry = new HashSet<>();

for(int i=0;i<a.length-1;i++) {
	setarry.add(a[1]);
}
int aa1=a.length-1;
for(int i=0;i<aa1;i++) {
	
	if(a[i]<a[i+1])
	{
		int temp =a[i];
		a[i]=a[i+1];
		a[i+1]=temp;
		
	}
	
	
	
}
int output =a[1];
System.out.println(output);

	}

}
