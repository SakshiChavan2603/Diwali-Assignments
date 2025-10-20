// 4.	Check if a number is an Armstrong number
//    o	Input: Integer n
//    o	Output: True if sum of digits raised to power equals number


package practice_questions;

import java.util.Scanner;

public class ArmstrongCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		while(temp != 0) {
			int digit = temp % 10;
			sum = sum + (digit * digit * digit);
			temp = temp / 10;
		}
		
		if(num == sum) {
			System.out.println("The given number is an armstrong number");
		} else {
			System.out.println("The given number is not an armstrong number");
		}

	}

}
