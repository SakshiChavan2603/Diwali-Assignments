// 2.	Generate all prime numbers up to n
//   o	Input: Integer n
//   o	Output: List of primes ≤ n
package Practice_Questions;

import java.util.Scanner;

public class PrimeUptoN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number upto which you want to find prime numbers: ");
        int n = sc.nextInt();
        
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;  

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false; 
                    break;           
                }
            }

            if (isPrime) {
                System.out.println(i + " is a prime number");
            } 
        }
    }
}
