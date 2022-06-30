package Inheritance;

public class HIier_impliment {
public static void main(String[] args )
{
	 Hier_C1 a= new  Hier_C1();
	 a.bike();
	 a.car();
	 a.home();
	 System.out.println("--------------------");
	 Hier_C2 b=new Hier_C2();
	 b.cell();;
	 b.home();;
	 b.car();
	 
	 System.out.println("-----------------");
	 
	 Hier_C3 c=new Hier_C3();
	 c.home();
	 c.laptop();
	 c.car();
}
}
