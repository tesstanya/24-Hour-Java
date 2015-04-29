class TestModems {
	public static void main(String[] arguments) {
		CableModem roadRunner = new CableModem();
		DslModem bellSouth = new DslModem();
		AcousticModem guitarHero = new AcousticModem();
		
		// speed is inherited from the Modem superclass
		roadRunner.speed = 500000;
		bellSouth.speed = 400000;
		
		/* method strings are passed from their classes
		to the superclass */
		
		System.out.println("Trying the cable modem:");
		roadRunner.displaySpeed(); // superclass method
		roadRunner.connect(); // superclass method
		System.out.println("\nTrying the DSL modem:");
		bellSouth.displaySpeed(); // superclass method
		bellSouth.connect(); // superclass method
		System.out.println("\nTrying the Acoustic modem:");
		guitarHero.displaySpeed(); // superclass method
		guitarHero.connect(); /* even though Modem has its own 
		connect() method and AcousticModem inherits from Modem class,
		since it is an AcousticModem object, it will use the connect()
		method from its own class instead of the super class */
	}
}