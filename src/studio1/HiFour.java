package studio1;

import java.util.Scanner;

/**
 * From Sedgewick and Wayne, COS 126 course at Princeton
 * 
 */
public class HiFour {
	public static void main(String[] args) {
		System.out.println("Who are we saying hi to? ");
		Scanner in = new Scanner(System.in);
		System.out.print("Name 1: ");
		String s0 = in.nextLine();
		System.out.print("Name 2: ");
		String s1 = in.nextLine();
		System.out.print("Name 3: ");
		String s2 = in.nextLine();
		System.out.print("Name 4: ");
		String s3 = in.nextLine();
		//
		// Say hello to the names in s0 through s3.
		//
		System.out.println("Hello " + s0 + ", " + s1 + ", " + s2 + ", and " + s3 +"!");

	}
}
