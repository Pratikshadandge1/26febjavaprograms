package LogicalPrograms;

import java.util.Scanner;

public class Evenodd {
	public static void main(String[]args) 
	{
		
		int num;
		System.out.println("Enter the number");
	Scanner sc =new Scanner(System.in);// to get no from user we use scanner for that we use systemin
	   num=sc.nextInt();//no is int
	   
	   if(num%2==0) 
	   {
		   
		 System.out.println("Number is even");  
	   }
	   else 
	   {
		   System.out.println("Number is odd");
	   }
	}

	

	
}
