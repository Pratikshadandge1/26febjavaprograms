package Inheritance;

public class Singlelevel_C extends  SingleLevel_P {
	
	
	
	public void bike()
	{
		System.out.println("child have bike");
	}

	
	public static void main(String[] args) {
		Singlelevel_C d= new Singlelevel_C();
		
		d.home();
		d.car();
		d.bike();
		
	}

}
