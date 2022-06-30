package StaticMethod;

public class Return_prog {

	 public  static int add() {
		 
		 int a=10,b=30;
		 int add=a+b;
		 return add;
	 } 
	 
	 public static String printing() {
		 
		 return  "velocity";
	 
	 }
	
	public static void main(String[] args) {

		System.out.println("adddition="+ add());
		int  a= add ();
		System.out.println("addition="+ a);
	
		System.out.println("printing="+ printing());
		
		
	}

}
