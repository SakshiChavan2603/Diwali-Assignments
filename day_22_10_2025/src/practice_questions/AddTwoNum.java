// 1.	Addition of two numbers
//    o	Input: a, b
//    o	Output: a + b

package practice_questions;

import java.util.Scanner;

public class AddTwoNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1 : ");
		int num1 = sc.nextInt();
		System.out.println("Enter number 2 : ");
		int num2 = sc.nextInt();
		int sum = num1 + num2;
		System.out.println("The addition of num1 and num2 is : " + sum);
	}

}
