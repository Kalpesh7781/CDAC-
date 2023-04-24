package day7;

import java.util.Scanner;

public class PlayerMain {
public static void main(String[] args) {
	PlayerMngt p=new PlayerMngt();
	Scanner ip=new Scanner(System.in);
	
	while(true) {
	 
	System.out.println("enter a choice");
	System.out.println("1:create player");
	System.out.println("2.display player");
	System.out.println("3.player with max runs");
	System.out.println("4.remove player less than 100 runs");
	System.out.println("5: sort by name");
	int choice=ip.nextInt();
	switch(choice)
	{
	case 1:
		p.create();
		break;
	case 2:
		p.display();
		break;
	case 3:
		p.max();
		break;
	case 4:
		p.remove();
		break;
	case 5:
		p.name();
		break;
	}
  }
}
}
