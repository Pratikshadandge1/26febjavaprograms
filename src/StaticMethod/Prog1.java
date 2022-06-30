package StaticMethod;

//METHOD CALL FROM SAME CLASS

public class Prog1 {
	
	
	public static void show()  //user defined method
	{
		System.out.println("this is static show method");
	}

	public static void display() //user defined method
	
	{
		System.out.println("this is staic display method");
	}
	
	public static void main(String[] args) {
System.out.println("this is start of main method");
		display();
		show();
		System.out.println("this is end of main method ");
	}

}
