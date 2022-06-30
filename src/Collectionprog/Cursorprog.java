package Collectionprog;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;



import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class Cursorprog {

	public static void main(String[] args) {
  Vector v1= new Vector();
  
  for(int i=0;i<10;i++)
  {
	  v1.add(i);
  }
  System.out.println(v1);
	  
  //cursor
  System.out.println("enumeration cursor");
  Enumeration e = v1.elements();
  
  //while(e.hasMoreElements())
//  {
//System.out.println(e.nextElement());
 // }
  //System.out.println("for loop usage");
  //for(;e. hasMoreElements();)
	//	  {
		//	  System.out.println(e.nextElement());
		  //}
//  System.out.println("for each loop usage");
 // for(Object value:v1) {
//	 System.out.println(value);
 // }
System.out.println("iterator cursor");
	Iterator  itr= v1.iterator();
	while(itr.hasNext())
	{
//System.out.println(itr.next());
	 int num=(int)itr.next();
	 if(num%2==0) {
		 System.out.println(num);
	 }
	
	 else {
		 itr.remove();
	 }
	 System.out.println(v1);
	 }
	
	
	System.out.println("list Iterator cursor");
	
	ListIterator li=v1.listIterator();
	
	while(li.hasNext())
{
		int num1=(int)li.next();
		if(num1==5) {
			li.remove();
		}
		else if (num1==2)
		   {
			li.add(22);
	        }
     	else if(num1==3) 
			{
				li.set(33);
			}
		System.out.println(v1);


}
		}
	}
	
	
	



