package Collectionprog;

import java.util.ArrayList;
import java.util.Vector;



public class ArrylistProgram1 {

	public static void main(String[] args) {

		
	ArrayList al1 =new ArrayList();
	ArrayList al2 = new ArrayList (1000);
	ArrayList al3=new ArrayList (al2);
	
	
	System.out.println(al2.size());
	
	
	System.out.println(al3.isEmpty());
	
	al1.add(20);
	al1.add(30);
	al1.add(5.4);
	al1.add(12);
	
	System.out.println(al1);
    System.out.println(al1.size());
	System.out.println(al1.isEmpty());
	//System.out.println(al1.listIterator());
	
     al1.add(1 ,3455);
	System.out.println(al1);
	al1.add(1,"Harry");
	al1.add("harry");
	System.out.println(al1);
	
	
	
	al1.remove(1);
	System.out.println(al1);
	
	System.out.println(al1.contains(5.4));
	al1.add(null);	
	System.out.println(al1);
	

	
	//Vector v1 =new Vector ();
	//System.out.println(v1.capacity());
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
