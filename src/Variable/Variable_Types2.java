package Variable;

public class Variable_Types2 {

	
	static int a=10;// static variable
	
  public void show(){
	
	  
	  int b=20; //local variable
	  
	System.out.println(a+" "+b);//10 20
	
	a++;//11
	b++;//21
	
  }
   public static void main(String[]arg) {
		
		Variable_Types2 a = new Variable_Types2();
		
		//Variable_Types2+class/data type
		//object variable
		//new=it is creating the new memory which has the name a
		
		a.show();
		a.show();
		a.show();			}

	
	
	
	
}
