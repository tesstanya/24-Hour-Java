class TestModems {
	public static void main(String[] arguments) {
		CableModem roadRunner = new CableModem();
		DslModem bellSouth = new DslModem();
		
		// speed is inherited from the Modem superclass
		roadRunner.speed = 500000;
		bellSouth.speed = 400000;
		
		System.out.println("Trying the cable modem:");
		roadRunner.displaySpeed(); // superclass method
		roadRunner.connect(); // class method
		System.out.println("Trying the DSL modem:");
		bellSouth.displaySpeed(); // superclass method
		bellSouth.connect(); // class method
	}
}