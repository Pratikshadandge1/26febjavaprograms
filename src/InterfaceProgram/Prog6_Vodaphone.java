package InterfaceProgram;

public class Prog6_Vodaphone implements Prog6_TRAI{

	@Override
	public Void audiocalling() {
		System.out.println("vodaphone gives 50000 min free calling");
		return null;
	}

	@Override
	public void videocalling() {
	System.out.println("vodaphone gives 3GB of data on daily basis");
		
	}

	@Override
	public void textmessaging() {
	System.out.println("vadaphone gives 150 text message on daily basisis" );
		
	}

}
