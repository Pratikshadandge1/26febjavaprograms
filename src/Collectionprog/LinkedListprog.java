 package Collectionprog;

import java.util.LinkedList;

public class LinkedListprog {

	public static void main(String[] args) {

	LinkedList ll1= new LinkedList ();
	
	LinkedList ll2 =new LinkedList();
	
	
	System.out.println("size="+ll1.size());
	
	ll1.add("Tokyo");
	ll1.add("moscow");
	ll1.add("rio");
	ll1.add("22");
	ll1.add("null");
	ll1.add("+");
	
	System.out.println("ll1 contains="+ ll1);
	ll1.add(null);
	System.out.println("ll1 contains="+ ll1);
	ll1.addFirst("burline");
	ll1.addLast("denver");
	System.out.println("ll1 contains="+ ll1);
	System.out.println(ll1.contains("+"));
	System.out.println(ll1.contains("rio"));

	ll1.remove(3);
	System.out.println(ll1);
	ll1.removeFirst();
	ll1.removeLast();
	System.out.println(ll1);
	
	//System.out.println(ll1.contains());
	
	
	
	
//System.out.println(ll1);
	
	
	
	
	}}
		
	
	

	


