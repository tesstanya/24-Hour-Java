import java.util.*;
	
class RepeatForLoop {
	public static void main(String[] arguments) {
		String sentence = "Thorium 230 is not a toy";
		int count = 1;
		Calendar start = Calendar.getInstance();
		int startMinute = start.get(Calendar.MINUTE);
		int startSecond = start.get(Calendar.SECOND);
		start.roll(Calendar.MINUTE, true); //rolls the value one minute forward in time
		int nextMinute = start.get(Calendar.MINUTE);
		int nextSecond = start.get(Calendar.SECOND);
		for (; count < 1000000; count++) {
			System.out.println(sentence);
			GregorianCalendar now = new GregorianCalendar();
			if (now.get(Calendar.MINUTE) >= nextMinute)
				if (now.get(Calendar.SECOND) >= nextSecond)
					break;
		}
		System.out.println("\nI wrote the sentence " + count + " times");
		System.out.println("I have learned my lesson.");
	}
}