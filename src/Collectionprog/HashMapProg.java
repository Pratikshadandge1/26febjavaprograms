package Collectionprog;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapProg {

	public static void main(String[] args) {

		      HashMap hm1= new HashMap();
				HashMap hm2= new HashMap(1000);
				HashMap hm3= new HashMap(100,90);
		     	HashMap hm4= new HashMap (hm3);
	
	hm1.put(3, "google");
	hm1.put(4,"TataMotor");
	hm1.put(2,"Google");
	hm1.put(1,"Apple");
	System.out.println(hm1);
	hm1.put(1, "Affle");
	System.out.println(hm1);
	hm1.put(2,"alphabate");
	System.out.println(hm1);
	
	System.out.println("-------------------");
	System.out.println(hm1.keySet());
	System.out.println(hm1.values());
	System.out.println(hm1.entrySet());
	
	Set al = hm1.entrySet();
	System.out.println("/Cursor");
	Iterator itr = al.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	}

}
    