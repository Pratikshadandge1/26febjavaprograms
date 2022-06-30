package Array;

public class Prog1 {

	public static void main(String[] args) {

		int mock1_mark[]= {12,10,19,18,20,12,19,17,9,15,17,20};
		
		System.out.println("size of arry mock_matrk=" + mock1_mark.length);
		
		//there is no size method is available in array 
		//but there is length field available in the array
	    //that can be used find the length or size of the array,

		
		System.out.println("second element="+ mock1_mark[1]);
		
		for (int i=0;i<12;i++) 
		{
			System.out.print( mock1_mark[i]+" ");
		}
	
		int mock2_mark[]=new int[10];
		mock2_mark[0]=15;
		mock2_mark[1]=12;
		mock2_mark[3]=16;
		
		System.out.println();
	   System.out.println( "mock2_mark=" +mock2_mark[0]);
	   System.out.println( "mock2_mark=" +mock2_mark[1]);
	   System.out.println( "mock2_mark=" +mock2_mark[3]);
       System.out.println("third element="+mock2_mark[2]);

	   for ( int i=0;i<5;i++) 
	   {
		   
		   System.out.print(mock2_mark[i]+" ");
		   
		   
	   }
	  
	   
	}

}
