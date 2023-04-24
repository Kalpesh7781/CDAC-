package practice;

import java.util.Comparator;

public class Sortbystd2 implements Comparator<Student2> {

	@Override
	public int compare(Student2 o1, Student2 o2) {
		// TODO Auto-generated method stub
		if(o1.std<o2.std)
			return -1;
		else
		return 1;
	}

}
