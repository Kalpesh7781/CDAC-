package day4;

public class Bike extends Vehicle {
int passanger_seats;
int saddle_height;
@Override
void start() {
	// TODO Auto-generated method stub
	System.out.println("bike Started");
}
public Bike( int passanger_seats, int saddle_height) {
	super(2, "black", "Petrol", 140);
	this.passanger_seats = passanger_seats;
	this.saddle_height = saddle_height;
	System.out.println(toString());
	System.out.println(super.toString());
	System.out.println();
	start();
	accelerate();
	super.brake();
	 
	System.out.println();
}
@Override
public String toString() {
	return " passanger_seats=" + passanger_seats + ", saddle_height=" + saddle_height + " ";
}
@Override
void accelerate() {
	// TODO Auto-generated method stub
 System.out.println("bike accelarated");
}


}
