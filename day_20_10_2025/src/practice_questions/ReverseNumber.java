// 5.	Reverse a number
//    o	Input: Integer n
//    o	Output: Reversed integer


package practice_questions;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find reverse : ");
		int num = sc.nextInt();
		int temp = num;
		int rev =0;
		while(temp != 0) {
			int digit = temp % 10;
			rev = rev * 10 + digit;
			temp = temp / 10;
		}
		
		System.out.println("The reversed number is : " + rev);

	}

}
