// 4.	Sum of digits of a number
//    o	Input: Integer n
//    o	Output: Sum of all digits


package practice_questions;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		while(temp != 0) {
			int digit = temp % 10;
			sum = sum + digit;
			temp = temp / 10;
		}
		
		System.out.println("The sum of digits of given number is : " + sum);

	}

}
