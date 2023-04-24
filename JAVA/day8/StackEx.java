package day8;

import java.util.Iterator;
import java.util.Stack;

public class StackEx {
 
	Stack<String> st=new Stack<>();
	
	void crete(String x)
	{
	st.push(x);	
		
	}
	void display()
	{
		
		 System.out.println(st);
		 
		 Iterator it=st.iterator();
		 {
			 while(it.hasNext())
				 System.out.println("using iteratr "+ it.next());
		 }
		 
		 
		/* for (Integer ele: st)
		 {
			 System.out.println(ele);
		 }*/
	}	
	 //	 
	void remove()
	{System.out.println("item popped :"+st.pop()); }	
	
	void clear()
	{
		st.clear();
		
	}
	
	 

}
