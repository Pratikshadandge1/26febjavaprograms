package String;

public class Prog4 {

	public static void main(String[] args) {

		String name1="Pune";
		String name2="Pune";
		String name3="pune";
		
		String name4="Mumbai";
		String name5="Mumbai";
		
		String str1= "I Am An Engineer ."; 
		
		System.out.println(name1.equals(name2));
		System.out.println(name4.equals(name5));
		System.out.println("harry".equals("harry"));
		System.out.println(name1.equals(name3));
		System.out.println(name1.equalsIgnoreCase(name3));
		System.out.println(str1.length());
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		

		
	}

}
