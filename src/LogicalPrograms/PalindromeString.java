package LogicalPrograms;

public class PalindromeString {

	public static void main(String[] args) {

		String str ="madam";
		String strori=str;
	    String strrev= "";
	    char ch;
	
	for (int i=0;i<str.length();i++) 
	{
		ch= str.charAt(i);
		strrev = strrev+ch;
	}
	System.out.println("orignal string ="+strori);
	System.out.println("reverse string ="+strrev);
	

	
	if (strori.equals(strrev))
		
	{
		System.out.println("palindrome");
	}
	else
	System.out.println("not palindrome");
	}
}