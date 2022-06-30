package Collectionprog;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetprog {


	public static void main(String[] args) {

		HashSet hs1= new HashSet ();//lc
		HashSet hs2= new HashSet (1000);
		HashSet hs3= new HashSet(1000,90);
		HashSet hs4= new HashSet(hs3);
	hs1.add("mumbai");
	hs1.add("b");
	hs1.add("a");
	hs1.add("20");
	hs1.add("#");
	
	
System.out.println(hs1);
hs1.add("A");
System.out.println(hs1);
hs1.add("a");
System.out.println(hs1);
hs1.add(null);
System.out.println(hs1);
hs1.add(null);
System.out.println(hs1);
System.out.println(hs1.isEmpty());



System.out.println("================================");
ArrayList al=new ArrayList(hs1);
System.out.println(al);
System.out.println(al.get(4));


}
	
	}
	


