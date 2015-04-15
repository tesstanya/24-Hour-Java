class Favorite {
	public static void main(String[] arguments) {
		String favorite = "piano";
		String guess = "ukelele";
		System.out.println("Is Ada's favorite instrument a " + guess + "?");
		System.out.println("Answer: " + favorite.equals(guess));
	}
}