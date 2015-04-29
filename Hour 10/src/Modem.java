public class Modem {
	int speed;
	String method;
	
	public void displaySpeed() {
		System.out.println("Speed: " + speed);
	}
	
	//changing so this method can be inherited
	public void connect() {
		System.out.println("Connecting to the Internet . . .");
		System.out.println("Using a " + method);
	}
}