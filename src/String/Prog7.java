package String;

public class Prog7 {

	public static void main(String[] args) {

		String str1 = "";
		String str2="Ron";
		 
		String str3 = "i am computer engineer";
	
		System.out.println(str1.isEmpty());
		System.out.println(str2.isBlank());
		System.out.println(str2.contains("o"));
		System.out.println(str2.indexOf("R"));
		System.out.println(str2.charAt(0));
		String str4 = str3.replace(" ","was");
		System.out.println(str4);
		
	}

}
