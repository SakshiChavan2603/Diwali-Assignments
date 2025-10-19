// 4.	Generate Fibonacci series up to n terms
//   o	Input: Integer n
//   o	Output: First n Fibonacci numbers
package Practice_Questions;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a numbr upto which you want to find Fibonacci Series : ");
		int num = sc.nextInt();
		int a = 0;
		int b = 1;
		for(int i = 0; i <= num; i++) {
			System.out.println(a);
			int c = a + b;
			a = b;
			b = c;
		}

	}

}
