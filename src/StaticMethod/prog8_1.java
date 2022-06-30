package StaticMethod;



public class prog8_1 {
	
	
	public static int add(int a,int b) {
		
		int sum=a+b;
		System.out.println("addition of two="+sum);
		return sum;
	
	}
	
	public static char display(char a) {
		System.out.println("char="+a);
		return a;
		
	}

	public static void main(String[] args) {
     add(10, 20);
  
	display('p');

	}
}