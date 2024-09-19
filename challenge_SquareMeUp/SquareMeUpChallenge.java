/**
 * 
 */
package challenge_SquareMeUp;

import java.util.Scanner;

/**
 * 
 */
public class SquareMeUpChallenge {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Obtaining params
		int lengthSize = obtainLengthSize();
		char borderChar = obtainBorderChar();

		// Drawing square

		drawHorizontal(lengthSize, borderChar);
		drawSides(lengthSize, borderChar);
		drawHorizontal(lengthSize, borderChar);

	}

	/**
	 * This method draws the vertical (right and left) sides of the required square
	 * minus the top and bottom characters
	 * 
	 * @param lengthSize - this size is obtained from the user
	 * @param borderChar - this size is obtained from the user
	 */
	public static void drawSides(int lengthSize, char borderChar) {
		for (int i = 0; i < lengthSize - 2; i++) {
			System.out.print(borderChar + "  ");
			for (int j = 0; j < lengthSize - 2; j++) {
				System.out.print("   ");
			}
			System.out.println(borderChar);
		}
	}

	/**
	 * This method draws the horizontal (top and bottom) sides of the required
	 * square
	 * 
	 * @param lengthSize - this size is obtained from the user
	 * @param borderChar - this size is obtained from the user
	 */
	public static void drawHorizontal(int lengthSize, char borderChar) {
		for (int i = 0; i < lengthSize; i++) {
			System.out.print(borderChar + "  ");
		}
		System.out.println();
	}

	/**
	 * This method obtains the border char from the user
	 * 
	 * @return - return borderChar
	 */
	public static char obtainBorderChar() {
		char borderChar;
		String userInput;

		Scanner myScan = new Scanner(System.in);
		// User Prompt
		System.out.println("Enter the character to build the box with...");
		userInput = myScan.nextLine();
		borderChar = userInput.charAt(0);
		return borderChar;
	}

	/**
	 * This method obtains lengthSize from the user
	 * 
	 * @return - return lengthSize
	 */
	public static int obtainLengthSize() {
		int lengthSize;

		Scanner myScan = new Scanner(System.in);
		// User Prompt
		System.out.println("Enter the length of side");
		lengthSize = myScan.nextInt();
		myScan.nextLine(); // clear scanner
		return lengthSize;
	}

}