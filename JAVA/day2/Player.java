package day2;
import java.util.Scanner;

 
public class Player {
String name;
int age;
String countryname;
int totalruns;

Player()
{
	Scanner ip=new Scanner(System.in);
	System.out.println("enter player details :name, age,  country,  total_run");
	name=ip.next();
	age=ip.nextInt();
	countryname=ip.next();
	totalruns=ip.nextInt();
	//this.show();
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
		Player []p=new Player[5];
		
		for (int i=0;i<p.length;i++)
		{
			
			 p[i]=new Player();
			 p[i].show();
		}
		 
		 
	//
	}

}
