// 5.	Find GCD and LCM of two numbers
//    o	Input: a, b
//    o	Output: GCD and LCM


package practice_questions;

import java.util.Scanner;

public class GCDandLCM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1 : ");
		int a = sc.nextInt();
		System.out.println("Enter number 2 : ");
		int b = sc.nextInt();
		int gcd = 0;
		
		for(int i = 1; i <= a && i <= b; i++) {
			if(a % i ==0 && b % i == 0) {
				gcd = i;
			}
		}
		System.out.println("The GCD of " + a + " & " + b + " is : " + gcd);
		
		int lcm = (a * b)/gcd;
		System.out.println("The LCM of " + a + " & " + b + " is : " + lcm);

	}

}
