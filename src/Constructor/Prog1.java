package Constructor;

public class Prog1 {
        int a;
		double b;
		 Prog1()
		{
			
			a=10;
			b=10.102;
		System.out.println("This is constructor");
		
		}
		public void display()		{
			
			
			System.out.println("A="+a);
			System.out.println("B="+b);
		}
		
	    public static void main(String[] args) {
	    	 Prog1 a= new  Prog1();
      a.display();
		
	}

}
