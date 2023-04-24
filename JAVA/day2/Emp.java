package day2;
import java.util.Scanner;

public class Emp {
    int empno;
    String empname;
    String designation;
    String dept;
    int salary;
    
    Emp()
    {
        System.out.println("enter emp data :no,name,desig,dept,sal");
        Scanner in=new Scanner(System.in);
        empno=in.nextInt();
        empname=in.next();
        designation=in.next();
        dept=in.next();
        salary=in.nextInt();
        
    }
    
    public void dispempdata()
    {
        System.out.println(empno);
        System.out.println(empname);
        System.out.println(designation);
        System.out.println(dept);
        System.out.println(salary);
    }
    public static void main(String[] args) {
       // System.out.println("enter emp data :no,name,desig,dept,sal");
    	Emp []e=new Emp[2];
    	
    	for(int i=0;i<e.length;i++)
    	{
    	  e[i] = new Emp();
         // e[i].readempdata();
       // Emp e2 = new Emp();
          e[i].dispempdata();
    	}
        
        //Emp e2=new Emp();
       // e2.readempdata();
        
       // e1.dispempdata();
       // e2.dispempdata();
    }
}
