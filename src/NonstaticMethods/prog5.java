package NonstaticMethods;

public class prog5 {

      public int add() 
     {
	int a=10,b=20,d;
	d=a+b;
	return d;
     }

     public String name() {
	 String name = ("pratiksha");
     return name;
    }


	public static void main(String[] args) {
		 prog5 p=new prog5();
		 p.add();
		 p.name();
		 }
		
			
			
		
		
	}


