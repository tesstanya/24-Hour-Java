class IfGrade {
	public static void main(String[] arguments) {
		int grade = 100;
		
		if (grade < 60)
			System.out.println("You got an F! Shame on you!");
		else if (grade < 70)
			System.out.println("You got a D! You passed with a bad gpa.");
		else if (grade < 80)
			System.out.println("You got a C! That's so average.");
		else if (grade < 90)
			System.out.println("You got a B! Not good enough.");
		else if (grade < 100)
			System.out.println("You got an A! Excellent job!");
		else if (grade == 100)
			System.out.println("You got an A+! What a perfect student :)");
	}
}