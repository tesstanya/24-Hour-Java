class Wheel {
	public static void main(String[] arguments) {
		// creating and initializing an array of STRINGS
		String phrase[] = {
				"A STITCH IN TIME SAVES NINE",
				"DON'T EAT YELLOW SNOW", 
				"JUST DO IT",
				"EVERY GOOD BOY DOES FINE",
				"I WANT MY MTV", 
				"HOW 'BOUT THEM COWBOYS",
				"PLAY IT AGAIN, SAM",
				"FROSTY THE SNOWMAN",
				"ONE MORE FOR THE ROAD",
				"HOME FIELD ADVANTAGE",
				"VALENTINE'S DAY MASSACRE",
				"GROVER CLEVELAND OHIO",
				"WONDERFUL WORLD OF DISNEY", 
				"COAL MINER'S DAUGHTER", 
				"WILL IT PLAY IN PEORIA"
		};
		
		// store the number of times each letter occurs in a string phrase
		int[] letterCount = new int[26];
		
		// iterates through each string phrase
		for (int countString = 0; countString < phrase.length; countString++) {
			// save current string to a variable
			String current = phrase[countString];
			
			// convert current string to a char array
			char[] letters = current.toCharArray();
			
			/* iterate through char array to count 
			number of times each character occurs */
			for (int countChar = 0; countChar < letters.length; countChar++) {
				char lett = letters[countChar];
				
				/* increment the number of occurrences for the char
				in the letterCount array */
				if ( (lett >= 'A') & (lett <= 'Z') ) {
					letterCount[lett - 'A']++;
				}
			}
		}
		
		/* displays each character followed by the number of times
		it occurred in all phrases together */
		for (char count = 'A'; count <= 'Z'; count++) {
			System.out.print(count + ": " + letterCount[count - 'A'] + "\t");
		}
		System.out.println();
	}
}