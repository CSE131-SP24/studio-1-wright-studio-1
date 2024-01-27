package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner nums = new Scanner(System.in);
		System.out.println("Value for n1?");
		int n1 = nums.nextInt();
		System.out.println("Value for n2?");
		int n2 = nums.nextInt();
		
		double avg = ((double)n1 + (double)n2) / 2;
		
		System.out.println("The average of " + n1 + " and " + n2 + " is " + avg);

	}

}
