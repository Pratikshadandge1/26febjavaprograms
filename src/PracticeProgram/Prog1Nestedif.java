package PracticeProgram;

public class Prog1Nestedif {

	public static void main(String[] args) {

		String fbid="velocity";
		String fbpass="Admin@123";
		
		if(fbid =="velocity") 
		{
			if(fbpass=="Admin@123")
			{	
			System.out.println("login sucessfully");
			}
			else {
				System.out.println("password fail");
			}
			
		}
		
		else {
			System.out.println("you enterd wrong id");
		}
		
		
		}
	}

