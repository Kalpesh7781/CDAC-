package day2;

public class Student1 {
	int id;
	String name;
	int age;
	Student1()
	{
		this(15,"roy",48);
		System.out.println("no parametrize constructor");
	}
	Student1(int mid,String mname,int mage)
	{
		System.out.println("parametrized constuctor");
		this.id=mid;
		this.name=mname;
		this.age=mage;
		this.show();
	}
	public void show()
	
	{
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
	}
	
	
	public static void main(String[] kalp)
	{
		Student1 s1=new Student1();
		//s1.show();
		
	}

}
