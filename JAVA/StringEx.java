package javatut;

import java.util.Random;

public class StringEx {
public static void main(String[] args) {
	String str=new String("Hello Kalpesh ");
	String str2="welcome to java";
	String str3=new String("hello kalpesh ");
	String str4="  ";
	
	//char at method
char c=str.charAt(4);  //to print char at that index
 System.out.println(c);
 
 //concat method 
 //to connect two string
 System.out.println(str.concat(str2));
System.out.println(str.concat("how are you"));

//contains method 
//check that the sequence is present in string or not
System.out.println(str.contains("ello"));
System.out.println(str.contains(str2));

//code point at 
//return ascii value of char at that index
System.out.println(str.codePointAt(6));
System.out.println(str.charAt(6));

//code point before
//return ascii value of char which is before the char at that index
System.out.println(str.codePointBefore(7));
System.out.println(str.charAt(7));

//codePointCount method
//returns count of unicode values between the range of index
System.out.println(str.codePointCount(2,9));

//compareto method
//compare unicode values of first two char of that two string
System.out.println((str.codePointAt(0))-(str2.codePointAt(0)));
System.out.println(str.compareTo(str2));

//.compareToIgnoreCase method
//compare two strings irrespective to case and use as compareto method
System.out.println(str.compareToIgnoreCase(str3));
System.out.println(str.compareToIgnoreCase(str2));
System.out.println(str3.compareTo(str2));

System.out.println(str.endsWith(" "));
System.out.println(str2.endsWith("a"));
System.out.println(str2.endsWith("k"));

System.out.println(str2.equals(str2));
System.out.println(str.equals(str3));

System.out.println(str.equalsIgnoreCase(str3));
System.out.println(str2.equalsIgnoreCase(str3));

System.out.println(str.hashCode());

System.out.println(str.indent(15));
System.out.println(str.indent(3));

System.out.println(str.indexOf(97));   //pass ascii value it will give index of that ascii value char else print -1
System.out.println(str.indexOf(6));  //97=a
System.out.println(str.indexOf(104));

System.out.println(str.indexOf("ll"));
System.out.println(str.indexOf("lp"));

System.out.println(str.indexOf(101, 5));
System.out.println(str.indexOf(101, 0));

System.out.println(str.indexOf("l", 0));
System.out.println(str.indexOf("l", 5));

System.out.println(str4.isBlank()); //"   " return true

System.out.println(str4.isEmpty());//"  " return false  length=0 then true only

System.out.println(str.lastIndexOf(108)); //l=108

System.out.println(str.lastIndexOf("l"));

System.out.println(str.lastIndexOf(108, 5));
System.out.println(str.lastIndexOf(108, 1));

System.out.println(str.length());
System.out.println(str2.length());

System.out.println(str.repeat(2));
System.out.println(str.repeat(4));

System.out.println(str3.replace("l", "p"));
System.out.println(str3.replace("ell", "oo"));

System.out.println(str.startsWith("H"));
System.out.println(str.startsWith("h"));

System.out.println(str3.substring(3));
System.out.println(str3.substring(2, 9));

System.out.println(str3.valueOf(5));

String [] s1=str.split(" ");
int i=0;
while(i!=s1.length)
{
System.out.println(s1[i]);
i+=1;
Random r=new Random();
int a=r.nextInt(1,7);
System.out.println("random: "+a);
}
 
}
}
