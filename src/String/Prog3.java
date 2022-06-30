package String;

public class Prog3 {

	public static void main(String[] args) {

     String str1= "pratiksha";
     String str2= "pratiksha";
     String str3= "pratiksha";
     
     
     String str4 = new String("Dandge");
     String str5 = new String ("Dandge");
    
     int a=10,b=10;
     
    System.out.println(str1);
    str1.concat("Dandge");
    System.out.println(str1);
    str1=str1.concat(str5);
    System.out.println(str1);
    
    System.out.println("-------------------------");
      
    System.out.println(a==b);       // true...value comparison
    System.out.println(str4==str5);   //false address comparison
    System.out.println(str1==str2);  //true
    System.out.println(str3==str4);   //true
   
    System.out.println("***************************");
    
    StringBuffer str100 = new StringBuffer("Harry");
    System.out.println(str100);
    str100.append("potter");
    System.out.println(str100);
    
	}

}
