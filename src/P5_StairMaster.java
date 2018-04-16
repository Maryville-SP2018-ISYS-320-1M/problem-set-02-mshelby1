/*
	ISYS 320
	Name(s): Matthew Shelby
	Date: 4/15/2018
*/
//I am quite lost and have really confused myself on this problem.
public class P5_StairMaster {

	public static final int width = 6;
	public static final int amount = 5;

	public static void main(String[] args) {
		drawFirstStep();
		DrawSteps(amount);
	}

	public static void drawFirstStep() {
		System.out.print("**");
		for (int i = 1; i <= width; i++ ) {
			System.out.print("*");
		}
		System.out.print("**");
		for (int i1 = 1; i1 <= width; i1++ ) {
			System.out.print("*");
		}
	}
	public static void DrawSteps(int amount) {
		System.out.print("**");
		for (int i = 1; i <= width; i++ ) {
			System.out.println(" ");
			for (int i1 = 1; i1 <= width; i1++ ) {
				System.out.print("*");
			}
		}
		System.out.print("**");
		for (int i = 1; i <= width; i++ ) {
			System.out.println(" ");
			for (int i1 = 1; i1 <= width; i1++ ) {
				System.out.print("*");
	}
	}
}
}