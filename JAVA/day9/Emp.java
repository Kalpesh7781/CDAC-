package day9;

import java.io.Serializable;

public class Emp implements Serializable {
 
int eid;
String name;
int sal;
public Emp(int eid, String name, int sal) {
	//super();
	this.eid = eid;
	this.name = name;
	this.sal = sal;
}
@Override
public String toString() {
	return " eid=" + eid + ", name=" + name + ", sal=" + sal + " ";
}


}
