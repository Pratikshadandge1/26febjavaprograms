package InterfaceProgram;

public class Prog5C implements Prog5P1,Prog5P2 {

	@Override
	public void display2() {
		System.out.println("display2 method");
	}

	@Override
	public Void show()
	{
		System.out.println("This class Implements the show method");
		return null;
	}

	@Override
	public void display1() {
System.out.println("Display1 method");		
	}

}
