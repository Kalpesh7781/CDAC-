package practice;

public class Student2 implements Comparable<Student2>{
	int rollno;
	String name;
	int std;
	String hobby;
	public Student2(int rollno, String name, int std, String hobby) {
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
	@Override
	public int compareTo(Student2 o) {
		// TODO Auto-generated method stub
		if(rollno<o.rollno)
			return 1;
		else
		return -1;
	}
	 


}
