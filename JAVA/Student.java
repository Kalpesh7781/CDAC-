package practice;

public class Student {
int rollno;
String name;
int std;
String hobby;
public Student(int rollno, String name, int std, String hobby) {
	//super();
	this.rollno = rollno;
	this.name = name;
	this.std = std;
	this.hobby = hobby;
}
@Override
public String toString() {
	return "rollno= " + rollno + ", name= " + name + ", std= " + std + ", hobby= " + hobby + "";
}


}
