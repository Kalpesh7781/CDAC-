package day4;

public abstract class Vehicle {
int no_of_wheels;
String colour;
String fuel_type;
int speed;
abstract void start();
abstract void accelerate(); 
void  brake() {System.out.println("brakes applied");};
{}
public Vehicle(int no_of_wheels, String colour, String fuel_type, int speed) {
	 
	this.no_of_wheels = no_of_wheels;
	this.colour = colour;
	this.fuel_type = fuel_type;
	this.speed = speed;
}
@Override
public String toString() {
	return " no_of_wheels=" + no_of_wheels + ", colour=" + colour + ", fuel_type=" + fuel_type + ", speed="
			+ speed + "";
};

}
