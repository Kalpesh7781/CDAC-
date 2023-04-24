package javatut;

public class Typecast {
public static void main(String[] args) {
	int a=68;
	char b;
	b=(char)a;
	System.out.println(a);
	System.out.println(b);
	
	int c=129;
	 
	byte d;
	d=(byte)c;  //range of byte -128to127
	System.out.println(d);
 
	byte f=50;
	int h;
	h=(f*5);  //no need of type casting since value is out of byte range it will automatically cast into int
	System.out.println(h);
	
	byte k=50;
	k=(byte)(k*2);//without type cast it will give error cause byte automatically cast to int during exp 50*2
	System.out.println(k);
	
}
}
