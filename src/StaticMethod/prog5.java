package StaticMethod;

public class prog5 {
	
	public static int mul() {
		
		int a=20,b=30;
		int mulvar=a*b;
		return mulvar;
	}
	
	public static void main(String[] args) {

	System.out.println("main started");
	int out = mul();
	System.out.println("output="+out);
	System.out.println("main ended");
	
	}

	
}
