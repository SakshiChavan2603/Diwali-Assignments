// 3.	Print number pattern (e.g., triangle, pyramid)
//    o	Input: Rows r
//    o	Output: Pattern using loops


package practice_questions;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows : ");
		int row = sc.nextInt();
		
//		1 
//		12 
//		123 
//		1234 
//		for(int i = 1; i <= row; i++) {
//			for(int j = 1; j <= i; j++) {
//				System.out.print(j);
//			}
//			System.out.println(" ");
//		}
		
		
//		    1
//		   12
//		  123
//		 1234

//		for(int i = 1; i <= row; i++) {
//			for(int space = i; space <= row; space++) {
//				System.out.print(" ");
//			}
//			for(int j = 1; j <= i; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
//		    1 
//		   1 2 
//		  1 2 3 
//		 1 2 3 4 
//		for(int i = 1; i <= row; i++) {
//			for(int space = i; space <= row; space++) {
//				System.out.print(" ");
//			}
//			for(int j = 1; j <= i; j++) {
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}
		
		
//		    1 
//		   1 2 
//		  1 2 3 
//		 1 2 3 4 
//		  1 2 3 
//		   1 2 
//		    1 
		for(int i = 1; i <= row; i++) {
			for(int space = i; space <= row; space++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		// below triangle
		for(int i = row - 1; i >= 1; i--) {
			for(int space = row; space >= i; space--) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		

	}

}
