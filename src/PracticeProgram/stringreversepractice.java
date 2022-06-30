package PracticeProgram;

public class stringreversepractice {

	public static void main(String[] args) {
 String str="harrypotter";
 String strrev="";
 char ch;
 
 for(int i=str.length()-1;i>=0;i--)
 {
	 ch= str.charAt(i) ;
	 strrev=strrev+ch;
	
 }
 System.out.println("stringreverse="+strrev);
	}

}
