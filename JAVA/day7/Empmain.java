package day7;
import java.util.*;
public class Empmain {

	public static void main(String[] args) {
		EmpMang e=new EmpMang();
		Scanner ip=new Scanner(System.in);
		
		 
		while(true)
		{
			System.out.println("enter a choice");
			System.out.println("1:create");
			System.out.println("2:display"); 
			System.out.println("3:add element");
			System.out.println("4:update");
			System.out.println("5:delete");
					 
	 
				 
			int ch1=ip.nextInt();
	switch(ch1) {
	case 1:
		e.createEmp();
		System.out.println();
		break;
	case 2:
		e.display();
		System.out.println();
		break;
	case 3:
		e.insert();
		break;
	case 4:
		e.update();
		break;
		
	case 5:
		e.remove();
		break;
	case 6:
		e.sort();
		break;
		
	}
		
			 
		}	
				
			
		
	}
}
