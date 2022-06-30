package Variable;

public class Variables_Types1 {

	static int a=10;    // static variable
	 static int b=20;         //Globle variable/instance variable
	
	public static void main(String[] args) {
     
	int c=30;  //local variable
	final int d=40;	
      
      final double intrest_rate=7.9;   //variale
      
      System.out.println("globle variable="+b);
      System.out.println("static variable="+a);
      System.out.println("local variable="+c);
     System.out.println("local variable="+intrest_rate);
	System.out.println("local variablr="+d);
	
	a=100;
	c=300;
	b=400;
	//d=500;   final value can't be changed
	System.out.println("=====================");
    System.out.println("globle variable="+b);
    System.out.println("static variable="+a);
    System.out.println("local variable="+c);
   System.out.println("local variable="+intrest_rate);
	System.out.println("local variablr="+d);

	}

}
