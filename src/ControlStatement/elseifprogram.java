package ControlStatement;

public class elseifprogram {

	public static void main(String[] args) {
		int chemmarks = 70;
				if (chemmarks>=35 && chemmarks<60) 
				{
					System.out.println(" pass ");
				}
				else if (chemmarks>=60 && chemmarks<80)
				{
					System.out.println(" pass with second class");
				}
				else if (chemmarks>=80 && chemmarks<90)
				{
					System.out.println(" pass with first class");
				}
				else if (chemmarks>=90 && chemmarks<=100)
				{
					System.out.println(" pass with Distinction");
				}
				else if (chemmarks>100)
				{
					System.out.println("Wrong input,please enter correct marks");
				}
				else 
				{
					System.out.println("fail");
				}
	}

}
