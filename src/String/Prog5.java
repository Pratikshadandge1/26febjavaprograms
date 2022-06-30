package String;

public class Prog5 {

	public static void main(String[] args) {

		String sentence = "India is developing country";
		
		System.out.println( "length="+sentence.length());
		System.out.println(sentence.indexOf("i"));
		System.out.println(sentence.indexOf("y"));
		System.out.println(sentence.lastIndexOf("i"));
		
		System.out.println(sentence.startsWith("i"));
		System.out.println(sentence.startsWith("I"));
		System.out.println(sentence.endsWith("y"));
		System.out.println(sentence.startsWith("i", 0));
		System.out.println(sentence.startsWith("I", 0));
		System.out.println(sentence.indexOf('i',4));//i in india and there index  for calculating nxt i index
		System.out.println(sentence.indexOf('i',7));//at given time we meare from 1 and result measure from 0 of string

		
		
	}

}
