package Collectionprog;

import java.util.Vector;

public class VectorProg {

	public static void main(String[] args) {

		
	Vector v1=new Vector();
	Vector v2=new Vector (1000);
	Vector v3=  new Vector(v2);
	Vector v4=new Vector(5,200);
	
	
	
	for(int i=0;i<5;i++)
	
	{
		v4.add(i);
	}
		System.out.println(v4);
		System.out.println(v4);
		v4.add(12);
		System.out.println(v4);
		System.out.println(v4.capacity());
		v4.add(13);
		System.out.println(v4);
		
		System.out.println(v1.capacity());
		System.out.println(v2.capacity());
	System.out.println(v3.capacity());
	
	v3.add(12);
	v3.add(246);//incerement with 1 1
	
	System.out.println(v3.capacity());
	
	for (int i=0;i<10; i++)
	{
		v1.add(i);
	}
	
System.out.println(v1);

System.out.println(v1.size());
System.out.println(v1.capacity());
v1.add(20);
System.out.println("----------------");

System.out.println(v1);
System.out.println(v1.size());
System.out.println(v1.capacity());//10+10=20
v1.add(21);
System.out.println(v1);
System.out.println(v1.size());
System.out.println(v1.capacity());

for(int i=0; i<8; i++) {
	v1.add(i);
	
}
System.out.println(v1);
System.out.println(v1.size());
System.out.println(v1.capacity());

v1.add(23);
System.out.println(v1.capacity());
System.out.println(v1.size());
}



	}
	



	