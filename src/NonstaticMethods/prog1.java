package NonstaticMethods;

public class prog1 {

	
	public void mul() {
	
		System.out.println("multiplication="+10*20);
	
	}

		public void div() {
		
			System.out.println("division="+20/10);
		

	
		
	}
	public static void main(String[] args) {
    prog1 p =new prog1();
    
     //prog=> class/data type
    //p= variable/reference variable
    //new =it creating the new mememory which has the name a
    //it store data of class
    //prog1()=.object/constructor		
     p.mul();
	p.div();
	}

}
