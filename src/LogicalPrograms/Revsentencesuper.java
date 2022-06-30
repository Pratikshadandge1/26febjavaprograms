package LogicalPrograms;

public class Revsentencesuper {
	
	
	 public void ReverceEachWordSentence (){

		  String sentence=("I am an automation engineer ");
		  String splitarry[]=sentence.split("");
		   String reverseword="";
		   char ch;
		   
		   String revEachWord[]=new String[5];
		   
		   for (int i=0;i<splitarry.length;i++)
			{
			  reverseword =""; 
			  for(int j=0;j<splitarry[i].length();j++) 
			  {
				 ch=splitarry[i].charAt(j) ;
				 reverseword = ch +reverseword;
			  }
			   
			  revEachWord[i]= reverseword;
			  }
		    
		   for(int k=0;k<revEachWord.length;k++) 
		  
			  System.out.print(revEachWord[k]+" ");
	}


	     public static void main (String []args){} 
		  {
			Revsentencesuper a = new Revsentencesuper();
			  a.ReverceEachWordSentence();
		  
		  }
}
		
		  
		

	



