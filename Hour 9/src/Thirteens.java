class Thirteens {
	public static void main(String[] arguments) {
		
		// create an int array of 400 elements
		int[] thirteen = new int[400];
		
		// store the first 400 multiples of 13
		for (int count = 0; count < thirteen.length; count++)
			thirteen[count] = (count+1) * 13;
		
		// display all multiples of 13
		for (int count = 0; count < thirteen.length; count++) {
			System.out.print(thirteen[count] + " ");
			
			/* go back to the top of the loop
			or else one multiple will print on the first line
			nine multiples will print on the second line
			and ten multiples will be printed on each line
			after that */
			if (count == 0)
				continue;
			
			// print 10 multiples per line
			if ( (count % 10) == 0 )
				System.out.println();
		}
	}
}