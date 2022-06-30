package String;

public class Prog6 {

	public static void main(String[] args) {

		String name1= " pune";
		String name2= " Mumbai";
		String name3=" pune";
		
		
		String name =name1+ name2;
		System.out.println( "concat by ="+ name);
		String name4 =name1.concat(name2).concat(name3) ;
		System.out.println("concat by string method ="+ name4);
		
		String str1 = "I am Learning selenium Automation.";
		System.out.println(str1.length());
		System.out.println(str1.substring(3));

		System.out.println(str1.substring(10));
		
		System.out.println(str1.subSequence(4, 10));
		System.out.println(str1.substring( 6 ,22));
		
		System.out.println(str1.substring(10,13));
		System.out.println(str1.substring(10,18));
		System.out.println(str1.contains("auto"));
		System.out.println(str1.contains("Auto"));
		System.out.println(str1.contains("."));
		

		
		
		
		
		
		
	}

}
