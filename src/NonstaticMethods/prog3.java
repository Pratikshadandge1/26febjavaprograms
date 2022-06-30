package NonstaticMethods;

public class prog3 {

	public void diplay(String name)
	   {

		System.out.println("Name="+name);
		
		}

	
	public void grade (char c) 
	{
		
		System.out.println("grade="+c);
	}
    
	
	public static void main(String[]args) {
       prog3 a =  new prog3();
       a.diplay("harry");
       a.grade('c');
     
     
	
    }


}
