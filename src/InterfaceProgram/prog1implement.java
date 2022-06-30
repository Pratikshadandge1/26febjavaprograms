package InterfaceProgram;

public class prog1implement implements  Program1{

	String name;
	int emp_id;
	double salary;
	

	@Override
	public void getEmpDetails() {
		name = "Harry";
		emp_id =111;
		salary =60000.123;
		
	}

	@Override
	public void showEmpdeatails() {
		System.out.println("Name  of employment="+name);
		System.out.println("ID of employment="+emp_id);
		System.out.println("Salary of employment="+salary);

		
	}

}
