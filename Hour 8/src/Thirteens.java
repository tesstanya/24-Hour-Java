class Thirteens {
	public static void main(String[] arguments) {
		/* This program prints out multiples of 13
		with 10 numbers per line */
		for (int i = 1; i <= 400; i++) {
			System.out.print(i * 13 + " ");
			if (i % 10 == 0)
				System.out.println();
		}
	}
}