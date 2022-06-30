package Casting;

public class Prog1 {

	public static void main(String[] args) {

		int a = 10;
		System.out.println("orignal value of A="+ a);
		
		double b=a;
				System.out.println("after implicit casting value of b="+b);
		double c =100.22;
		System.out.println("orignal value of c="+c);
		
		int d=(int) c;
		System.out.println("after explicit casting value of D="+d);
		
		float e =10.22f;
		int f=(int) e;
		System.out.println("e="+e);
		System.out.println("f="+f);
	}

}
