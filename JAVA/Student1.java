package practice;

import java.io.Serializable;

public class Student1 implements Serializable{
	int rollno;
	String name;
	int std;
	String hobby;
	public Student1(int rollno, String name, int std, String hobby) {
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
