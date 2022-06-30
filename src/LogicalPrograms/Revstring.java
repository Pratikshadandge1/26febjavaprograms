package LogicalPrograms;

public class Revstring {

	

	public static void main(String[] args) {

		
		String str="harrypotter";
	String strRev ="";
	
	char ch ;
	for (int i=str.length()-1;i>=0;i--) 
	{
		ch=str.charAt(i);
	
	strRev = strRev+ch;
	}
	System.out.println("string reverse="+strRev);

}
}
