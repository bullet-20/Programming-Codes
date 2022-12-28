package assignmentB;

import java.util.Scanner;

public class PyramidPattern {

	public static void main(String[] args) {
		
		System.out.println("Put any amount of numbers");
		Scanner scan = new Scanner(System.in);	
		int numOfStars = scan.nextInt();
		
		for(int i = 1; i <= numOfStars; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = numOfStars; i >= 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}

}
