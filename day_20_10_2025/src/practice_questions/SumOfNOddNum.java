// 2.	Sum of first n odd numbers
//    o	Input: Integer n
//    o	Output: Sum of first n odd numbers


package practice_questions;

import java.util.Scanner;

public class SumOfNOddNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number upto which you want to find sum of natural odd numbers : ");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i = 0; i <= num; i++) {
			if(i % 2 != 0) {
				sum = sum + i;
			}
		}
		System.out.println("The sum of first " + num + " natural number is : " + sum);

	}

}
