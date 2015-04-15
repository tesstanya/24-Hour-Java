import java.util.*;

class Name {
	public static void main(String[] arguments) {
		
		// create an array and store names in it
		String names[] = {"Peter", "Patricia", "Hunter", "Sarah",
				"Gabe", "Gina", "Rob", "John", "Zoey", "Tammy", 
				"Robert", "Sean", "Paschal", "Kathy", "Neleh",
				"Vecepia" };
		// display the names in the order they were initialized
		System.out.println("The original order:");
		for (int i = 0; i < names.length; i++)
			System.out.println(i + ": " + names[i]);
		
		// this will sort them in alphabetical order
		Arrays.sort(names);
		
		// print out sorted list of names
		System.out.println("The new order:");
		for (int i = 0; i < names.length; i++)
			System.out.println(i + ": " + names[i]);
	}
}