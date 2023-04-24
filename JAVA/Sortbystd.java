package practice;

import java.util.Comparator;

public class Sortbystd implements Comparator<Student> {

 

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(o1.std<o2.std)
			return -1;
		else
		return 1;
	}

}
