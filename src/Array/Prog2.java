package Array;

import java.util.Scanner;

public class Prog2 {

	public static void main(String[] args) {

		int size;
		System.out.println("enter the size of arry");
		Scanner s1= new Scanner(System.in);
		size=s1.nextInt();  //accepting new value from user
		System.out.println("size of arry is "+size);
		
		int a[]=new int[size];
		System.out.println("enter elements");
		
		for(int i=0;i<size;i++)
		{
			a[i]=s1.nextInt();//
		}
	
		System.out.println("arry element are:");
		
		//for(int i=0;i<size;i++) 
	//	{
		//	System.out.println(a[i]);
		//}
	}

}
