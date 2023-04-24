package day10;

public class Emp {
	int eno;
	String name;
	float sal;
	
	public Emp(int eno, String name, float sal) {
		super();
		this.eno = eno;
		this.name = name;
		this.sal = sal;
	}
	
	void dispemp()
	{
		System.out.println(eno+" "+name+" "+sal);
	}
	
}
