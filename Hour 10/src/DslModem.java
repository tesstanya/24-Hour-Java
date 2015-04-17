public class DslModem extends Modem {
	/* This class inherits variables and methods from the Modem class
	by extending the Modem superclass */
	
	String method = "DSL phone connection";
	
	public void connect() {
		System.out.println("Connecting to the Internet . . .");
		System.out.println("Using a " + method);
	}
}