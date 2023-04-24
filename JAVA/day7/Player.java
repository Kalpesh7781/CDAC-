package day7;

public class Player {
String name;
int total_run;
int no_of_wick;
int no_of_match;
String count;
int no_of_cent;
String category=null;
public Player(String name, int total_run, int no_of_wick, int no_of_match, String count, int no_of_cent
		) {
	 
	this.name = name;
	this.total_run = total_run;
	this.no_of_wick = no_of_wick;
	this.no_of_match = no_of_match;
	this.count = count;
	this.no_of_cent = no_of_cent;
	if(this.no_of_cent>=10)
		this.category = "A";
	else
		this.category="B";
}
public Player() {
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "[name=" + name + ", total_run=" + total_run + ", no_of_wick=" + no_of_wick + ", no_of_match="
			+ no_of_match + ", count=" + count + ", no_of_cent=" + no_of_cent + ", category=" + category + "]";
}

}
