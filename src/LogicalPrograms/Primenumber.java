package LogicalPrograms;

public class Primenumber {

	public static void main(String[] args) {

		int num=23;
		int count=0;
		for(int i=2;i<num/2;i++) 
		{
			if(num%i==0)//23%2=1 
				
				
			{	
			count++;
			break;
			}
		
		}
		if (count==1) 
		{
			System.out.println(" Number is Not prime");
		}
		else 
		{
			System.out.println(" Number is prime");
		}
	}

}
