package day6;

public abstract class Employee {
int ssn;
String name;
public Employee(int ssn, String name) {
	//super();
	this.ssn = ssn;
	this.name = name;
}
abstract void salary();
 
@Override
public String toString() {
	return " ssn=" + ssn + ", name=" + name + " ";
}
}
