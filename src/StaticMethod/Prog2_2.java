package StaticMethod;

public class Prog2_2 {

	public static void main(String[] args) {

		System.out.println("main method started");
		Prog2_1.show1();
		Prog2_1.show2();
		System.out.println("main methd ended");
		Prog2_1.show2();
		Prog2_1.show1();
	
	}

}
