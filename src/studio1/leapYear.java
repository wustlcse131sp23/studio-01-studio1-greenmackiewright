package studio1;

import java.util.Scanner;

public class leapYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a year ");
		int year = in.nextInt(); 
		
	
		boolean leapYear = (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
		//System.out.println(leapYear);
		System.out.print("The year " + year + " is a leap year: " + leapYear);
		
		
	}

}
