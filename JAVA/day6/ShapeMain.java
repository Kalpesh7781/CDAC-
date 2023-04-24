package day6;

import java.util.Scanner;

public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		boolean flag=true;
		
		 while(flag)
		 {
			 System.out.println("Enter shape you want to draw");
			 System.out.println("1: circle");
			 System.out.println("2: trianlge");
			 System.out.println("3: rectangle");
			 System.out.println("4: exit");
			 int ch=ip.nextInt();
			 switch(ch)
			 {
			 case 1:
				 Circle c=new Circle();
				 c.draw();
				 break;
			 case 2:
				 Triangle t=new Triangle();
				 t.draw();
				 break;
			 case 3:
				 Rectangle r=new Rectangle();
				 r.draw();
				 break;
				 default:
					 flag=false;
					 
			 
			 }
			 
		 }
	}

}
