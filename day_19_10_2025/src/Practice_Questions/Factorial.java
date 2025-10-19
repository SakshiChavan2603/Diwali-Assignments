// 3.	Calculate factorial of a number
//   o	Input: Integer n
//   o	Output: n! (e.g., 5! = 120)
package Practice_Questions;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find factorial : ");
		int num = sc.nextInt();
		int fact = 1;
		for(int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		
		System.out.println("Factorial of " + num + " is " + fact);

	}

}
