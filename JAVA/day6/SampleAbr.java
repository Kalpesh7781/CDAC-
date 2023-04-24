package day6;

abstract class SampleAbr {
int no;
String name;
float bal;
public SampleAbr(int no, String name, float bal) {
	//super();
	this.no = no;
	this.name = name;
	this.bal = bal;
}

@Override
public String toString() {
	return " [no=" + no + ", name=" + name + ", bal=" + bal + "]";
}

abstract void disp();
}
