package day7;

import java.util.Comparator;

public class sortbywicket implements Comparator <Player>{

	@Override
	public int compare(Player o1, Player o2) {
		// TODO Auto-generated method stub
		if (o1.no_of_wick>o2.no_of_wick)
		return -1;
		else 
			return 1;
	}

	 

}
