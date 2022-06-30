package PracticeProgram;

public class Elseifstatement {

	public static void main(String[] args) {

		int chemmark=366;
		if (chemmark>=40 && chemmark<60) {
			
		System.out.println("student pass with 2nd class ");
		}
		
		else if(chemmark>=60 && chemmark<75)
		{
			System.out.println("student pass with 1st class");
		}	
		else if(chemmark>75 && chemmark<90)
		{
			System.out.println("student pass with distinction");
		}
		else if(chemmark>90 && chemmark<=100) {
			System.out.println("student pass with merit");
			}
		
		else if (chemmark>100) {
			System.out.println("wrong input,please enter the correct mark");
		}	
		
		else {
			System.out.println("student fail in chemistry");
	            }
	
}	
}


//40-60=second class
//60-75=first class
//75-90=first class distinction
//90-100=merit
// above100-wrong input
//below60- fail