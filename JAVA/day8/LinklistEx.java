package day8;

import java.util.Collections;
import java.util.LinkedList;

public class LinklistEx {
LinkedList<Integer> ll=new LinkedList<>();

void addBeg(int x)
{
ll.addFirst(x);
}
void addGiv(int x,int y)
{
ll.add(x, y);	
}
void addAft(int x,int y)
{
int k=ll.indexOf(x);
ll.add(k+1, y);

}

void removeBeg()
{
	ll.removeFirst();
	}
void removeGiv(int x)
{
ll.remove(x);	
}
void rmoveAft(int x )
{
int k=ll.indexOf(x);
ll.remove(k+1);

}
void reverse()
{
	LinkedList <Integer> ll2=new LinkedList <>();
for(int x=ll.size()-1;x>=0;x--)
{
	 ll2.add(ll.get(x));
}
System.out.println(ll2);
}
void sort()
{
Collections.sort(ll);	
}
public void display() {
	// TODO Auto-generated method stub
	System.out.println(ll);
}
public void clear()
{
ll.clear();	
}
public void reverseSort() {
	// TODO Auto-generated method stub
	Collections.sort(ll,Collections.reverseOrder());	
}

}
