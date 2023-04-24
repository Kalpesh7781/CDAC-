package day8;

public class NestedTry {
	public static void main(String[] args) {
		try{
			
			int a=10;
		int b=0;
		int c=a/b;
		System.out.println(c);
			 
		int []arr=new int[2];
		try{arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;}catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println(ae.getMessage());
		}
		 for(int i=0;i<2;i++) {System.out.println(arr[i]);}}
		
		 		catch(Exception ae)
		{
			System.out.println(ae.getMessage());
		}
		 
		System.out.println("remaining part");
	 
	}

}
