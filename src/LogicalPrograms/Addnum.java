package LogicalPrograms;

public class Addnum {

	public static void main(String[] args) {

		
		int num=56789;//5678  567 56 5
		int addnum = 0;
		int sum = 0;//9 17 24 30
		
		while(num>0) 
		{
			int temp = num%10; //9 8 7 6 5
			num=num/10; //5678 567 56 0
			sum=sum+temp; //0+9=9 9+8=17 17+7=24 24+6=30 30+5=35
           }
	
	   System.out.println("sum of no="+sum);
	
	}

}
