// You are given an array of size n that contains distinct numbers from 0 to n. Your
// task is to find the one number that is missing from the array.


package coding_challenge;

import java.util.Scanner;

public class MissingTermInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter the elements of an array with one missing term : ");
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
		
		int sum = 0;
		for(int i = 0; i < n; i++) {
			sum = sum + arr[i];
		}
		
		int totalSum = (n * (n + 1)) / 2;
		int missingTerm = totalSum - sum;
		 System.out.println("The missing term from given array is : " + missingTerm);
		

	}

}
