public class AcousticModem extends Modem {
	 
	//constructor that passes a value to the variable
	public AcousticModem() {
		speed = 300;
	}
	
	public void connect() {
		System.out.println("Guitars can be acoustic "
				+ "but can Modems be acoustic too? [Gasp!]");
	}
}