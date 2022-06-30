package LogicalPrograms;

public class RevSentence {

	public static void main(String[] args) { 
      String sentence = "I am an automation engineer" ;
	String splitArry []= sentence.split(" ");
	System.out.println(splitArry.length);
	
	for(int i=0;i<splitArry.length;i++) 
	
		System.out.print(splitArry[i]+" ");
	
	System.out.print("\n======================");
	

	for (int i=splitArry.length-1;i>=0;i--)
	
		System.out.println(splitArry[i]+" ");
	
}
}