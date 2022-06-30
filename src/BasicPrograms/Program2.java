package BasicPrograms;

public class Program2 {

	public static void main(String[] args) {
	      int num=12345;
	      int revnum=0 ;
	      int multifactor= 10000;
	      
	      
	      System.out.println("reverse num"+revnum);
	      
	      for( int i=0; i<5;i++)
	      {
	    	  int temp= num %10; //5
	           num=num/10; //1234
	      revnum= revnum +temp *multifactor; //0+5*10000=50000
	    		multifactor= multifactor/10;  //1000
	      }
		System.out.println("reverse num ="+revnum);
		
		}

	}


