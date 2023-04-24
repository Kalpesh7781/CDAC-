package day12;

import java.util.Scanner;

public class ChangeCase {
public static void main(String[] args) {
	Scanner ip=new Scanner(System.in);
	String str=ip.nextLine();
	StringBuffer sf=new StringBuffer(str);
	for(int i=0;i<str.length();i++)
	{
		if(Character.isLowerCase(str.charAt(i)))
		{sf.setCharAt(i,Character.toUpperCase(str.charAt(i)));}
		else if (Character.isUpperCase(str.charAt(i)))
		{
			sf.setCharAt(i, Character.toLowerCase(str.charAt(i)));
		}
	}
	System.out.println(sf);
}
}
