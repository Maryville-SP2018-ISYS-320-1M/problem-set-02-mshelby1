/*
	ISYS 320
	Name(s): Matthew Shelby
	Date: 4/15/2018
*/

public class P1_NumbersRightMethod {

	public static void main(String[] args) {
		for(int i = 1; i <= 7; i++) {
		    for(int j = 7 - i; j > 0; j--)
		        System.out.print(" ");	        

		    for(int j = 0; j < i; j++)
		        System.out.print(i);		        

		    System.out.println();
		}
	}
}
