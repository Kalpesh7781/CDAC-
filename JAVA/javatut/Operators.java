package javatut;

public class Operators {
public static void main(String[] args) {
	int a=10;
	float b=20.40f;
	double d=40.098;
	int k=2;
	
	System.out.println(a+b);  //+
	System.out.println(d-b); //-    //arithmatic operator
System.out.println(a*d);  
System.out.println(b/a);
System.out.println(d%b);

a+=5; //a=a+5
b-=2;
d*=2;         //assignment operator
k/=1;

System.out.println(a);
System.out.println(b);
System.out.println(d);

System.out.println(k);      
 
a++;              //unary operator
System.out.println("after a++: "+a);
a--;
System.out.println("after a--: "+a);
int h=10+(++a);
System.out.println(h);
System.out.println(a);

int n=10+(a++);
System.out.println(n);
System.out.println(a);

//relational
//<;>;<=:>=;

//logical
// && || !

//bitwise
//& | ^ ~

//shift operator
//<< >> >>> <<< 
int t=(a<<2);
int f=(a>>2);
 

System.out.println("value of t "+ t);
System.out.println("value of f "+ f);

 //ternary operator
//(if?then:else)  (2<5?10:6) if2<5 print 10 else print 6

	
}
}
