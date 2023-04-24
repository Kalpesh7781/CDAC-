package day4;

public class Truck extends Vehicle{
int no_of_doors;
public Truck( int no_of_doors, int load_capacity,
		int size_of_contain) {
	super(6, "brown", "diesel", 70);
	this.no_of_doors = no_of_doors;
	this.load_capacity = load_capacity;
	this.size_of_contain = size_of_contain;
	System.out.println(toString());
	System.out.println(super.toString());
	loadCont();
	System.out.println();
	start();
	accelerate();
	super.brake();
	System.out.println();
}

@Override
public String toString() {
	return " no_of_doors=" + no_of_doors + ", load_capacity=" + load_capacity + ", size_of_contain="
			+ size_of_contain + " ";
}

int load_capacity;
int size_of_contain;

void loadCont()
{
System.out.println("load on Truck: "+(size_of_contain*80));	
}

@Override
void start() {
	// TODO Auto-generated method stub
System.out.println("truck started");	
}

@Override
void accelerate() {
	// TODO Auto-generated method stub
	System.out.println("truck accelerated");
}
 

}
