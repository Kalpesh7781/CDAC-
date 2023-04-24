package javatut;

public class ArrayEx2 {
	public static void main(String[] args) throws InterruptedException {
		int arr[]= {10,20,30,40,50,60,70,80};
		int arr2[]= {30,45,55,65,75};
		int arr3[];
	//array length from array class
		System.out.println(arr.length);
		arr3=arr;
		
		//hashcode method from object class 
		//display address of arr 
	System.out.println(arr.hashCode());
	System.out.println(arr2.hashCode());
	System.out.println(arr3.hashCode()); 
	
	
		//equal method to compare two array from object class
		boolean k=arr.equals(arr2);
		boolean l=arr.equals(arr3);
		System.out.println(k);
		System.out.println(l);
		
	 
		
	 
	}

 
	 
}
