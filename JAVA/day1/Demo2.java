package day1;
import java.util.*;


public class Demo2 {

	public  void k()
	{
		System.out.println("hi from k demo2");
		Demo d1=new Demo();
		d1.d();
		String[] args = null;
		Demo.main(args);
		//main(args);   //infinte loop
    //	int m=Scanner.nextInt();
		 
		 
	}
	
	public static void main(String[] args) {
 System.out.println("hello from main demo2");
 Demo.main(args);
 Demo2 d2=new Demo2();
 d2.k();
	}

}
