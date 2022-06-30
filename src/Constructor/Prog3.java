package Constructor;

public class Prog3 {
	
	int a,b;
	 Prog3(){
		 
		 a=10;
	 }
	 Prog3(int c){
		
		 b=c;
		 
	 }
	 
	 Prog3(int d,int e){
		 
		 a=d;
		 b=e;
	 }
	 
	 
	 public void show () {
		 
		 System.out.println("A="+a);
		 System.out.println("B="+b);
	 }
	public static void main(String[] args) {
		Prog3 x= new Prog3();
		x.show();
		System.out.println("--------------------------");
		
		Prog3 y= new Prog3 (200);
		y.show();
		System.out.println("--------------------------");
		
		Prog3 z = new Prog3(100,400);
		z.show();
		System.out.println("===============");
		
		Prog3 w = new Prog3(500);
		w.show();
		
	}

}
