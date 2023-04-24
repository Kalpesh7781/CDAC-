package day9;

import java.io.Serializable;

public class Student implements Serializable {
int id;
String name;
int marks;
String subject;
public Student(int id, String name, int marks, String subject) {
	super();
	this.id = id;
	this.name = name;
	this.marks = marks;
	this.subject = subject;
	
}
@Override
public String toString() {
	return " id= " + id + ", name= " + name + ", marks= " + marks + ", subject= " + subject + " ";
}

}
