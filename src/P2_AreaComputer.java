/*
	ISYS 320
	Name(s): Matthew Shelby
	Date: 4/15/2018
*/

public class P2_AreaComputer {

	public static void main(String[] args) {
		double a = 8;
		double b = 5.2;
		double c = 7.1;
		double s = ((a + b + c) / 2);
		double triangleArea = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		System.out.println("The area is " + triangleArea);
	}
	
}
