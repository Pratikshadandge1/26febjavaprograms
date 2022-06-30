package StaticMethod;

//STATIC METHOD WITH PARAMETER FROM SAME CLASS

public class Prog3_2 {

	public static void addition1 () 
	{
    int a=200,b=300,sum;
    sum=a+b;
    System.out.println("sum of two="+sum);
    
	}
   public static void addition(int a)   //a=10
   {
	   int sum;
	   sum=a+a;
	   System.out.println("sum of same number="+sum);
	   
   }   		
	
public static void summetion(int a,int b) {
	int sum1 = a+b;
	System.out.println("sum of two number="+sum1);
	
}
public static void subtraction(int a,int b) {
	int sub=a-b;
	System.out.println("subtraction of two number="+sub);
}
public static void main(String[]args ) {
	System.out.println("main started");
	addition(10);
	summetion(1000,2000);
	subtraction(100,200);
	subtraction(500,100);
	addition1();
	System.out.println("main ended"); 
}
}


