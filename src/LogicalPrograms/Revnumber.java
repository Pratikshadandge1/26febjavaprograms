package LogicalPrograms;

public class Revnumber {

	public static void main(String[] args) {

		
		int num=12345;
		String strNum =Integer.toString(num);
		String strrev="";
		
		char ch;
		for (int i=strNum.length()-1;i>=0;i--)
		{
			ch=strNum.charAt(i);
		strrev=strrev+ch;
		
		}

		
		System.out.println("string reverce="+strrev);
			
	}


	}


