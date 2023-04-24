package day7;

import java.util.Comparator;

public class sortByName implements Comparator <Player> {

	@Override
	public int compare(Player o1, Player o2) {
		// TODO Auto-generated method stub
		 String str1=o1.name.toUpperCase();
		 String str2=o2.name.toUpperCase();
		 return str1.compareTo(str2);
		 
		 
	}
	 

}
