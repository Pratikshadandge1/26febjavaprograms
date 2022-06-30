package PracticeProgram;

public class prog1Nestedif1 {

	public static void main(String[] args) {

		
	String pin = "1234";
	double amountInacc=1000;
	double amountToWithdraw= 800;

	if(pin == "1234") {
		if(amountToWithdraw <= amountInacc)
		{
			System.out.println("we can debit the cash");
		}
	
		else
		{
			System.out.println("insufficient amount");
		}
       }
	
	else {
		System.out.println("incorrect pin");
	}
	}

}
