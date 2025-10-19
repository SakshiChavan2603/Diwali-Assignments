// 5.	Check if a number is even or odd
//   o	Input: Integer n
//   o	Output: "Even" or "Odd"
package Practice_Questions;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a NUmber : ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println(" The given number is even");
		} else {
			System.out.println("The given number is odd");
		}
	}

}
