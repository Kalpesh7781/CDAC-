package day1;
import java.util.*;
public class Player {
String name;
int age;
String countryname;
int totalruns;

public void readdata()
{
	Scanner ip=new Scanner(System.in);
	System.out.println("enter player details :name, age,  country,  total_run");
	name=ip.next();
	age=ip.nextInt();
	countryname=ip.next();
	totalruns=ip.nextInt();
}

public void show()
{
if (totalruns>5000)
{
System.out.println("player info is: ");
System.out.println(name);
System.out.println("age is "+age);
System.out.println("country : "+countryname);
System.out.println("total runs : "+totalruns);
}
}

	public static void main(String[] args) {
		 Player p1=new Player();
		 p1.readdata();
		 Player p2=new Player();
		 p2.readdata();
		 Player p3=new Player();
		 p3.readdata();
		 Player p4=new Player();
		 p4.readdata();
		 Player p5=new Player();
		 p5.readdata();
		 
		 p1.show();
		 p2.show();
		 p3.show();
		 p4.show();
		 p5.show();

	}

}
