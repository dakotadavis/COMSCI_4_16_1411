public class COMSCI_4_16_1411 {
	public static void main(String[] args) {
		
		int startingValue = 65;
		int endingValue = 90 - 65 + 1;
		/* Math.random excludes the upper limit, so we must add the 1 to include
		 * the upper limit of Z 
		 */
		
		// For lowercase letters:
		// int startingValue = 97;
		// int endingValue = 122 - 97+ 1;
		
		// A=65, Z=90
		// We want to go from 65 and 65 + 25
		// a will be 65
		// b will be 25
		
		// Old code:
		// int number = (int) (startingValue + Math.random() *(endingValue));
		// System.out.println (number);
		// char letter =(char)number;
		// System.out.println (letter);
		
		// To simplify:
		System.out.println((char)(startingValue + Math.random()*(endingValue)));
		
		

	}

}
