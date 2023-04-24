package practice;

import java.util.LinkedList;

public class Linklistex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<Student> ll=new LinkedList <> ();
Student s1=new Student(1,"ram",6,"reading");
Student s2=new Student(2,"shamal",7,"writing");
Student s3=new Student(3,"amit",5,"playing");
Student s4=new Student(4,"manoj",6,"reading");
Student s5=new Student(5,"pooja",5,"writing");
Student s6=new Student(6,"raj",6,"singing");
ll.push(s1); //add to first
ll.add(s2);
ll.add(s3);
ll.add(s4);
ll.add(s5);

System.out.println("dislplya list");
for (Student ele:ll)
{System.out.println(ele);}

System.out.println("ussing offer to insert");
System.out.println(ll.offerLast(s6));

System.out.println("sort by name");
Sortbyname rs=new Sortbyname();
ll.sort(rs);
for (Student ele:ll)
{System.out.println(ele);}

System.out.println("element shows 1st element : "+ll.element());
System.out.println("peek display first element: "+ll.peek());
//System.out.println(ll.poll());
System.out.println("deleting first element:"+ll.pop()); 
for (Student ele:ll)
{System.out.println(ele);}

	}

}
