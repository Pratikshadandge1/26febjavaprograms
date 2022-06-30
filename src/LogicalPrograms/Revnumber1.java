package LogicalPrograms;

public class Revnumber1 {

	public static void main(String []args) {
	 int num=12345; //1234 123 12 1
	 int revnum=0; //50000 54000 54300 54320 54321
	 int multifactor=10000; //1000 100 10 1
	 
	 System.out.println("revnum="+revnum);
	 
	 for(int i=0;i<5;i++)
	 {
		  int temp = num%10;  // 5 4  3 2 1
		num=num/10;  // 1234  123 12 1
		 revnum = revnum+ temp* multifactor;  //0+5*10000 =50000   50000+(4*1000)=54000 54000(3*100)=54300   54300+(2*10)=54320 54320+(1*1)=54321
		 multifactor=multifactor/10 ;  //1000 100 10
	 }
	System.out.println("reverce num="+ revnum);
	
	}}	
	





