package day8;

public class TryFinally {
	public static void main(String[] args) {
		try{int []arr=new int[2];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		for(int i=0;i<2;i++) {System.out.println(arr[i]);}
	}/*catch(Exception i) 
		{
		System.out.println(i.getMessage()); 
		}*/
		finally 
		{System.out.println("this will execute anyhow");}
System.out.println("remain part");
}
}