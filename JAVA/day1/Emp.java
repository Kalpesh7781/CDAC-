package day1;
import java.util.*;

public class Emp {
    int empno;
    String empname;
    String designation;
    String dept;
    int salary;
    
    public void readempdata()
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
        Emp e1 = new Emp();
        e1.readempdata();
       // Emp e2 = new Emp();
       e1.dispempdata();
        
        Emp e2=new Emp();
        e2.readempdata();
        
       // e1.dispempdata();
        e2.dispempdata();
    }
}
