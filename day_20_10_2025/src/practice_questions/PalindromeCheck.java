// 3.	Check if a number is a palindrome
//    o	Input: Integer n
//    o	Output: True if reversed number equals original


package practice_questions;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check palindrome : ");
		int num = sc.nextInt();
		int temp = num;
		int rev =0;
		while(temp != 0) {
			int digit = temp % 10;
			rev = rev * 10 + digit;
			temp = temp / 10;
		}
		
		if(num == rev) {
			System.out.println("The number is palindrome");
		} else {
			System.out.println("The number is not palindrome");
		}

	}

}
