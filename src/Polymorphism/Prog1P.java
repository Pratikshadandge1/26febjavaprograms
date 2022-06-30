package Polymorphism;

public class Prog1P {
	
	public void add()
	{
		System.out.println("addition using zero argument="+(10+20));
		}

	public void add(int a) 
	{
		
		System.out.println("addition using one int arg="+(a+a));
	}
	
	public void add(int a,int b) {
		
		System.out.println("addition using  two int argument="+(a+b));

	}
	
	public void add(double a) {
		
		System.out.println("addition using  double argument="+(a+a));
	}
	public void add(double a,double b) {
		System.out.println("addition using one int arg="+(a+b));

		}
	
	public void add(double a,double b,double c) {
		System.out.println("addition using one int arg="+(a+b+c));

	}
	public static void main(String[] args) {
System.out.println("main started");
Prog1P X = new Prog1P();
X.add();
X.add(10);
X.add(11,22);
X.add(10.222);
X.add(11.11,22.22);
X.add(1.1,2.2,3.3);
System.out.println("main ended  cccc");
{
			
			
		}
		
	}

}
