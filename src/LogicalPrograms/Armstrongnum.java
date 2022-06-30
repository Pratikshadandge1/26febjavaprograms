package LogicalPrograms;

public class Armstrongnum {

	public static void main(String[] args) {

		
		int num=371,rem ,sum=0;
		int num1=num;// 371 37 3
		
		while(num>0)
		{
			rem=num%10;//1 7 3
			sum=sum+rem*rem*rem;   //0+1*1*1=1 1+7*7*7=344  344+3*3*3=27+344=371
			num=num/10;//37 3
		}
	if(num1==sum) 
	{
		System.out.println("given number is armstrongnumber");
	}
	else 
	{
		System.out.println("given number is not armstrongnumber");
	}
	}

}
