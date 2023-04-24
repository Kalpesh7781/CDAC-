package day4;

public class Car extends Vehicle {
int no_of_doors;
int passanger_seats;
@Override
void start() {
	// TODO Auto-generated method stub
 System.out.println("car started");
 
}
public Car(int no_of_doors, int passanger_seats) {
	super(4,"red", "Petrol", 120);
	this.no_of_doors = no_of_doors;
	this.passanger_seats = passanger_seats;
	
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
	return "cno_of_doors=" + no_of_doors + ", passanger_seats=" + passanger_seats + "";
}
@Override
void accelerate() {
	// TODO Auto-generated method stub
	System.out.println("car accelerate");
}

}
