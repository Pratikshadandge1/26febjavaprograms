package InterfaceProgram;

public class Prog6_Airtel implements Prog6_TRAI{

	@Override
	public Void audiocalling() {
		System.out.println("Airtel gives 5000 min free calling ");
		return null;
	}

	@Override
	public void videocalling() {
		System.out.println("Airtel gives 1.5GB of data on daily basis");
		
	}

	@Override
	public void textmessaging() {
System.out.println("Airtel gives 100 text message on daily basisis" );	

	}

}
