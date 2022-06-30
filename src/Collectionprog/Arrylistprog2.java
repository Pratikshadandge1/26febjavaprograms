package Collectionprog;

import java.util.ArrayList;

public class Arrylistprog2 {

	public static void main(String[] args) {
ArrayList al1=new ArrayList();
ArrayList al2= new ArrayList (1000);
ArrayList al3= new ArrayList (al1);


System.out.println("size of Al1 before adding elements="+al2.size());
al1.add("ron");
al1.add("wisely");
al1.add(5.4);

System.out.println("content of AL1="+al1);
System.out.println("size of al1 after adding elements="+al1.size());
	
	for(int i=10; i<20; i++) 
     {
	al1.add(i);
	}
	System.out.println(" containt of al1=" +al1);
	
	al1.add(3,1345);
	System.out.println(" containt of al1=" +al1);
	
	System.out.println(al1.contains(5.4));
	
	System.out.println(al1.indexOf(5.4));
	
	al1.remove(2);
	
	System.out.println("contains al1="+al1);
	
	
	System.out.println("*************************");
	
	for(Object value:al1) 
	{
		System.out.print( "  "  +value);
	}
	
	System.out.print("--------------------------");
	
for(int i=0;i<al1.size();i++)

	{
	System.out.println(al1.get(i));
	}
	
	//1.set(5,"prati");
	
	}
}
	
	
	
