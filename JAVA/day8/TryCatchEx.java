package day8;

public class TryCatchEx {
	public static void main(String[] args) {
	
		try{
			int a=10;
			int b=0;
		int c=a/b;
		System.out.println(c);}
		catch(ArithmeticException ae)
		{
			System.out.println(ae.getMessage());
		}
		 System.out.println("remaining part executed");
	}

}
