package day8;

import java.util.Scanner;

public class inklistMain {
	public static void main(String[] args) {
		LinklistEx l=new LinklistEx();
		Scanner ip=new Scanner(System.in);
		boolean a=true;
		while( a)
		{
			System.out.println("enter a choice");
			System.out.println("1:insert item at begin");
			System.out.println("2:insert item at given index");
			System.out.println("3:insert after given node ");
			System.out.println("4: delete at begining");
			System.out.println("5: delete at given position");
			System.out.println("6: delete after given node");
			System.out.println("7: reverse");
			System.out.println("8: dispLAY");
			System.out.println("9: clear");
			System.out.println("10: sort");
			System.out.println("11: reverse sort");
			System.out.println("exit");
			int ch=ip.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("enter element to add at begin");
				l.addBeg(ip.nextInt());
				break;
			case 2:
				System.out.println("enter index and then value");
			    l.addGiv(ip.nextInt(), ip.nextInt());
			    break;
			    
			case 3:
				System.out.println("enter ele to add after and value");
			       l.addAft(ip.nextInt(), ip.nextInt());
			       break;
			case 4:
				l.removeBeg();
				break;
			case 5:
				l.removeGiv(ip.nextInt());
				break;
			case 6:
				l.rmoveAft(ip.nextInt());
				break;
			case 7:
				l.reverse();
				break;
			case 8:
				l.display();
				break;
			case 9:
				l.clear();
				break;
			case 10:
				l.sort();
				break;
			case 11:
			 l.reverseSort();
			 break;
			default:
				a=false;
			}
		}
	}

}
