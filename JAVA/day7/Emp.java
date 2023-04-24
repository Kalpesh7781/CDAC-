package day7;
public class Emp {
int empno;
String name;
int age;
public Emp(int empno, String name, int age) {
	 
	this.empno = empno;
	this.name = name;
	this.age = age;
	//System.out.println(toString());
}
@Override
public String toString() {
	return "[empno=" + empno + ", name=" + name + ", age=" + age + "]";
}


}
