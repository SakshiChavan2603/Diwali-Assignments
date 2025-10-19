// 1.	Check if a number is prime
//   o	Input: Integer n
//   o	Output: True if prime, False otherwise
package Practice_Questions;

import java.util.Scanner;

public class PrimeNo {
	public boolean prime(int num) {
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		
		PrimeNo p = new PrimeNo();
		
		if(p.prime(num)) {
			System.out.println("The number is prime ");
		} else {
			System.out.println("The number is not prime ");
		}
		

	}

}
