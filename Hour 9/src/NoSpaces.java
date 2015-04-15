class NoSpaces {
	public static void main(String[] arguments) {
		String mostFamous = "Rudolph the Red-Nosed Reindeer";
		
		/* create a new char array that saves each character
		of the string as a separate element */
		char[] mfl = mostFamous.toCharArray();
		
		/* iterate through the char array and check each element
		for spaces */ 
		for (int dex = 0; dex < mfl.length; dex++) {
			//save each element in a variable to display
			char current = mfl[dex];
			
			// If the current element is not a space
			if (current != ' ')
				System.out.print(current);
			
			/* if the current character IS a space, then print a 
			"." instead */
			else
				System.out.print('.');
		}
	}
}