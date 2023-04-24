package day8;

import java.util.Scanner;

public class StackMain {
public static void main(String[] args) {
	StackEx s=new StackEx();
	Scanner ip=new Scanner(System.in);
	boolean a=true;
	while( a)
	{
		System.out.println("enter a choice");
		System.out.println("1:push item");
		System.out.println("2:display stack");
		System.out.println("3: pop top item");
		System.out.println("4: clear stack");
		System.out.println("exit");
		int ch=ip.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("enter element to stack");
			s.crete(ip.next());
			break;
		case 2:
		    s.display();
		    break;
		    
		case 3:
		       s.remove();
		       break;
		case 4:
			s.clear();
			break;
		default:
			a=false;
		}
	}
	
	
}
}
