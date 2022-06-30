package ControlStatement;

public class Nestedif1 {

	public static void main(String[] args) {
String pin= "1234";
double amountInAcc=1000;
double amountToWithdrawn=200;
if(pin=="1234") 
{
	if (amountToWithdrawn <= amountInAcc)
	{
System.out.println("we can debit thecash");
	}
	else {
		System.out.println("insufficient amount");
	}
}
else {
System.out.println("incorrect pin");	
}
}
}