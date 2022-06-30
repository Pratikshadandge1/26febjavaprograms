package Casting;

public class Prog2Implement {

	public static void main(String[] args) {
   
	// singal level inheritance
	
	Prog2C a= new Prog2C();
   a.parent();
   a.child();
 
   
   // up casting
   Prog2p  b = new Prog2C();
   b.parent();
 b.child();
 
 //down casting
    Prog2C c = (Prog2C) new Prog2p();
c.parent();
c.child();

	}

}
